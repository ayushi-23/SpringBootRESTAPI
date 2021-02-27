package io.springBootPractice.foodItems.snacks;
//AUTHOR:AYUSHI SAXENA
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.springBootPractice.foodItems.food.foodCategories;
import io.springBootPractice.foodItems.food.foodServices;

@RestController
public class snacksController {
	@Autowired
	private snacksService snackService;
	
	@RequestMapping("/foodCategories/snacks")
		public List<snacksItems> getAllSnackItems(){
			return snackService.getAllSnackItems();
		}
	
	@RequestMapping("/foodCategories/snacks/{id}")
	public snacksItems getSnackItems(@PathVariable String id) {
		return snackService.getSnackItems(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/foodCategories/snacks")
		public void addSnackItems(@RequestBody snacksItems fc) {
		snackService.addSnackItems(fc);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/foodCategories/snacks/{id}")
	public void updateSnackItems(@PathVariable String id, @RequestBody snacksItems fc) {
		snackService.updateSnackItems(id, fc);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/foodCategories/snacks/{id}")
	public void deleteSnackItems(@PathVariable String id) {
		snackService.deleteSnackItems(id);
	}
}
