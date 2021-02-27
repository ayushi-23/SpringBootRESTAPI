package io.springBootPractice.foodItems.drinks;
//AUTHOR:AYUSHI SAXENA
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class drinkItems {
	

		@Id  //tells that this field is a primary key
		private String id;
		private String name;
		private String description;
		
		//constructor
		public drinkItems() {
			
		}
		//Parameterized constructor
		public drinkItems(String id, String name,String description) {
			this.id = id;
			this.name = name;
			this.description = description;
		}
		//getters and setters
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		
		
}
