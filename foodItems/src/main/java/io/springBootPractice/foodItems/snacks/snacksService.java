package io.springBootPractice.foodItems.snacks;

//AUTHOR:AYUSHI SAXENA
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.springBootPractice.foodItems.food.foodCategories;
import io.springBootPractice.foodItems.food.foodRepository;

@Service
public class snacksService {
	@Autowired	
	private snacksRepository snackRep;
	
	public List<snacksItems> getAllSnackItems(){
		List<snacksItems> snacksItems = new ArrayList<>();
		snackRep.findAll().forEach(snacksItems::add);
		return snacksItems;
	}
	
	public snacksItems getSnackItems(String id) {
		return snackRep.findOne(id);
	}
	
	public void addSnackItems(snacksItems sn) {
		snackRep.save(sn);
	}
	
	public void updateSnackItems(String id, snacksItems sn) {
		snackRep.save(sn);
	}
	
	public void deleteSnackItems(String id) {
		snackRep.delete(id);
	}
}
