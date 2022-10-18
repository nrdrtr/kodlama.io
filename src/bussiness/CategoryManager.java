package bussiness;

import core.logging.Logger;
import dataAccess.abstracts.CategoryDao;
import entities.Category;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private Logger[] loggers;
	
 
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers ) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	public void save(Category category) {
		
			if(category.getCategoryName() == this.categoryDao.getByCategoryName()) {
				System.out.println(category.getCategoryName()+"isimli kategori zaten mevcut");
			}
			for (Logger logger : loggers) {
				logger.log(category.getCategoryName() + ": isimli kategori kaydedildi.");
			}
			
		}
		
	}
	


