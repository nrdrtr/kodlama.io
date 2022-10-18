package dataAccess.abstracts;

import entities.Category;

public interface CategoryDao {
	void save(Category category);
	String getByCategoryName();

}
