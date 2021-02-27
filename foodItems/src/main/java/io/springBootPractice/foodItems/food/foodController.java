package io.springBootPractice.foodItems.food;
//AUTHOR:AYUSHI SAXENA
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class foodController {
	@Autowired
	private foodServices foodService;
	
	@RequestMapping("/foodCategories")
		public List<foodCategories> getAllFoodCategories(){
			return foodService.getAllFoodCategories();
		}
	
	@RequestMapping("/foodCategories/{id}")
	public foodCategories getFoodCategory(@PathVariable String id) {
		return foodService.getFoodCategory(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/foodCategories")
		public void addFoodCategory(@RequestBody foodCategories fc) {
			foodService.addFoodCategory(fc);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/foodCategories/{id}")
	public void updateFoodCategory(@PathVariable String id, @RequestBody foodCategories fc) {
		foodService.updateFoodCategory(id, fc);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/foodCategories/{id}")
	public void deleteFoodCategories(@PathVariable String id) {
		foodService.deleteFoodCategory(id);
	}
}
