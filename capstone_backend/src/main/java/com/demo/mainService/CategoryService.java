package com.demo.mainService;



import java.util.List;

import com.demo.main.Category;

public interface CategoryService {
	public Category addCategory(Category Category);
	public Category getCategoryById(long id);
	public Category updateCategory(Category category);
	public  List<Category> getALLCategories();
	public  Category getCategoriesDropDown1(long id);
	public void deleteCategory(long id);
	
}

	