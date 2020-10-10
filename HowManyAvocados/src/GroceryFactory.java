/**
 File: GroceryFactory.java
 Author: Brynn Haley
 Date: October 10th 2020
 Description: This class creates a GroceryItem based on the type parameter.
 Citation:
 Tutorials Point. "Design Pattern - Factory Pattern".
 https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
 */
public class GroceryFactory {

	public GroceryItem getGroceryItem(String type) {
		switch (type) {
			case "Avocado":
				return new Avocado();
		}
		return null;
	}
}