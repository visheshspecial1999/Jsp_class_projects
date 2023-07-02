package store_management.service;

import java.util.List;

import store_management.dao.StoreDao;
import store_management.dto.Store;

public class StoreService {
	StoreDao storeDao = new StoreDao();

	// saveProduct method
	public String saveStore(Store store) {
		return storeDao.saveStore(store);
	}

	// updateProduct method
	public String updateProduct(Store store) {
		return storeDao.updateProduct(store);
	}
	
	// displayAll method
		public List<Store> displayAll() {
			return storeDao.displayAll();
		}
		
		// getById method
		public Store getById(int productId) {
			return storeDao.getById(productId);
		}
		
		// deleteById method
		public void deleteById(int productId) {
			storeDao.deleteById(productId);
		}
}
