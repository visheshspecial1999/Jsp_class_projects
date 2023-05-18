package com.jsp.jsp_servlet_crud_opration.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jsp.jsp_servlet_crud_opration.connection.ProductConnection;
import com.jsp.jsp_servlet_crud_opration.dto.Product;

public class ProductDao {

	// call the getConnection method and store the connection in Connection
	// interface
	Connection connection = ProductConnection.getConnection();

	// saveProduct method
	public String saveProduct(Product product) {
		Date date = new Date(product.getExpireDate().getTime());
		// create statement(PrepartedStatement)
		String insert = "insert into product values (?,?,?,?)";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(insert);
			preparedStatement.setInt(1, product.getProductId());
			preparedStatement.setString(2, product.getProductName());
			preparedStatement.setDouble(3, product.getProductPrice());
			preparedStatement.setDate(4,date);

			// execute query
			boolean b = preparedStatement.execute();
			if (b == false) {
				return "<h3 style='color:green'>data inserted successfully</h3>";
			} else {
				return "<h3 style='color:red'>data insertion failed</h3>";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// close connection
		finally {

			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	
	// getById method
	public  Product getById(int productId) {

		// create statement(PrepartedStatement)
		String displayQuery = "select * from product where productId=?";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(displayQuery);
			preparedStatement.setInt(1, productId);
			

			// execute query
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				Product product=new Product();
				product.setProductId(resultSet.getInt("productId"));
				product.setProductName(resultSet.getString("productName"));
				product.setProductPrice(resultSet.getDouble("productPrice"));
				product.setExpireDate(resultSet.getDate("expireDate"));
				return product;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// close connection
		finally {

			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	
	// deleteProduct method
	public void deleteProduct(int productId) {

		// create statement(PrepartedStatement)
		String delete = "delete from product where productId=?";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(delete);
			preparedStatement.setInt(1, productId);
			// execute query
			 preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// close connection
		finally {

			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	// displayProduct method
	public List<Product> displayProducts() {
		String displayQuery = "select *from product";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(displayQuery);
			ResultSet resultSet = preparedStatement.executeQuery();
			List<Product> productCollection = new ArrayList();
			while (resultSet.next()) {
				Product p = new Product();
				int productId = resultSet.getInt("productId");
				String productName = resultSet.getString("productName");
				Double productPrice = resultSet.getDouble("productPrice");
				Date expireDate = resultSet.getDate("expireDate");
				p.setProductId(productId);
				p.setProductName(productName);
				p.setProductPrice(productPrice);
				p.setExpireDate(expireDate);
				productCollection.add(p);
			}
			return productCollection;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	// updateProduct method
	public String updateProduct(Product product) {
		Date date = new Date(product.getExpireDate().getTime());
		// create statement(PrepartedStatement)
		String update = "update  product set productName=?,productPrice=?,expireDate=? where productId=?";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(update);
			preparedStatement.setString(1,product.getProductName());
			preparedStatement.setDouble(2, product.getProductPrice());
			preparedStatement.setDate(3, date);
			preparedStatement.setInt(4,product.getProductId());

			// execute query
			int b = preparedStatement.executeUpdate();
			if (b == 1) {
				return "<h3 style='color:green'>data updated successfully</h3>";
			} else {
				return "<h3 style='color:red'>data updation failed</h3>";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// close connection
		finally {

			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
}