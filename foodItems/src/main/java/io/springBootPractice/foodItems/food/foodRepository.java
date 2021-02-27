package io.springBootPractice.foodItems.food;
//AUTHOR:AYUSHI SAXENA
import org.springframework.data.repository.CrudRepository;

public interface foodRepository extends CrudRepository<foodCategories,String> {
	
}
