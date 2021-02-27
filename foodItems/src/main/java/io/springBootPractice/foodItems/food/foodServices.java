package io.springBootPractice.foodItems.food;
//AUTHOR:AYUSHI SAXENA
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class foodServices {
	@Autowired	
	private foodRepository foodRep;
	
	public List<foodCategories> getAllFoodCategories(){
		List<foodCategories> foodCategories = new ArrayList<>();
		foodRep.findAll().forEach(foodCategories::add);
		return foodCategories;
	}
	
	public foodCategories getFoodCategory(String id) {
		return foodRep.findOne(id);
	}
	
	public void addFoodCategory(foodCategories fc) {
		foodRep.save(fc);
	}
	
	public void updateFoodCategory(String id, foodCategories fc) {
		foodRep.save(fc);
	}
	
	public void deleteFoodCategory(String id) {
		foodRep.delete(id);
	}
}
