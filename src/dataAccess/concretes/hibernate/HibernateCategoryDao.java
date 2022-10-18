package dataAccess.concretes.hibernate;

import dataAccess.abstracts.CategoryDao;
import entities.Category;

public class HibernateCategoryDao implements CategoryDao{
	@Override
	public void save(Category category) {
		System.out.println("Kategori Hibernate ile kaydedildi : " + category.getCategoryName());
	}

	@Override
	public String getByCategoryName() {
		// TODO Auto-generated method stub
		return null;
	}

}
