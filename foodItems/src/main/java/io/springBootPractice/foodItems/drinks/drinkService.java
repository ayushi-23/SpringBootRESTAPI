package io.springBootPractice.foodItems.drinks;

//AUTHOR:AYUSHI SAXENA

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.springBootPractice.foodItems.food.foodCategories;
import io.springBootPractice.foodItems.food.foodRepository;
@Service
public class drinkService {
	@Autowired	
	private drinkRepository drinkRep;
	
	public List<drinkItems> getAlldrinkCategories(){
		List<drinkItems> drinkItems = new ArrayList<>();
		drinkRep.findAll().forEach(drinkItems::add);
		return drinkItems;
	}
	
	public drinkItems getdrinkCategory(String id) {
		return drinkRep.findOne(id);
	}
	
	public void adddrinkCategory(drinkItems di) {
		drinkRep.save(di);
	}
	
	public void updatedrinkCategory(String id, drinkItems di) {
		drinkRep.save(di);
	}
	
	public void deletedrinkCategory(String id) {
		drinkRep.delete(id);
	}
}
