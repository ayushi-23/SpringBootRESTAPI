package io.springBootPractice.foodItems.drinks;

//AUTHOR:AYUSHI SAXENA


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class drinkController {
	@Autowired
	private drinkService drinkService;
	
	@RequestMapping("/foodCategories/drinks")
		public List<drinkItems> getAlldrinkCategories(){
			return drinkService.getAlldrinkCategories();
		}
	
	@RequestMapping("/foodCategories/drinks/{id}")
	public drinkItems getdrinkCategory(@PathVariable String id) {
		return drinkService.getdrinkCategory(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/foodCategories/drinks")
		public void adddrinkCategory(@RequestBody drinkItems fc) {
		drinkService.adddrinkCategory(fc);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/foodCategories/drinks/{id}")
	public void updatedrinkCategory(@PathVariable String id, @RequestBody drinkItems fc) {
		drinkService.updatedrinkCategory(id, fc);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/foodCategories/drinks/{id}")
	public void deletedrinkCategories(@PathVariable String id) {
		drinkService.deletedrinkCategory(id);
	}
}
