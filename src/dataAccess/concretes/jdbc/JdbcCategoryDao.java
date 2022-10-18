package dataAccess.concretes.jdbc;

import dataAccess.abstracts.CategoryDao;
import entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void save(Category category) {
		System.out.println("Kategori JDBC ile kaydedildi : " + category.getCategoryName());
	}

	 
	@Override
	public String getByCategoryName() {
		// TODO Auto-generated method stub
		return null;
	}


}
