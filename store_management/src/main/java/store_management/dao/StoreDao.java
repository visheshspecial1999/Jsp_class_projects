package store_management.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Result;

import store_management.connection.GetConnection;
import store_management.dto.Store;

public class StoreDao {

	// saveProduct method
	public String saveStore(Store store) {
		Connection connection = GetConnection.getConnection();
		Statement statement;
		try {
			statement = connection.createStatement();

			String insert = "insert into storeproduct values(" + store.getProductId() + ",'" + store.getProductName()
					+ "'," + store.getProductPrice() + ")";
			boolean b = statement.execute(insert);
			if (b != true) {
				return "data inserted";
			} else {
				return "data not inserted";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	
	// updateProduct method
	public String updateProduct(Store store) {

		Connection connection = GetConnection.getConnection();
		Statement statement;
		try {
			statement = connection.createStatement();

			String update = "update storeproduct set storeproductName='"+store.getProductName()+"',storeproductPrice="+store.getProductPrice()+ " where storeproductId="+store.getProductId()+"";
			int b = statement.executeUpdate(update);
			if (b ==1) {
				return "data updated";
			} else {
				return "data not updated";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	
	// displayAll method
	public List<Store> displayAll() {
		Connection connection = GetConnection.getConnection();
		String display="select * from storeproduct";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(display);
		
	ResultSet resultSet	=preparedStatement.executeQuery();
	List<Store> list=new ArrayList<Store>() ;
	while(resultSet.next()) {
		Store s=new Store();
		int id=resultSet.getInt("storeproductId");
		String st1=resultSet.getString("storeproductName");
		double d=resultSet.getDouble("storeproductPrice");
		s.setProductId(id);
		s.setProductName(st1);
		s.setProductPrice(d);
		list.add(s);
	}
	return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	public Store getById(int productId) {
		Connection connection=GetConnection.getConnection();
		String getbyid="select * from storeproduct where storeproductId=?";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(getbyid);
		
		preparedStatement.setInt(1, productId);
	ResultSet resultSet	=preparedStatement.executeQuery();
		Store store=new Store();
		while(resultSet.next()) {
			int productId1=resultSet.getInt("storeproductId");
			String productName1=resultSet.getString("storeproductName");
			double productPrice1=resultSet.getDouble("storeproductPrice");
			
			store.setProductId(productId1);
			store.setProductName(productName1);
			store.setProductPrice(productPrice1);
		}
		return store;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	
	// deleteById method
	public void deleteById(int productId) {
		Connection connection=GetConnection.getConnection();
		String delete="delete from storeproduct where storeproductId=?";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(delete);
		
		preparedStatement.setInt(1, productId);
		preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}