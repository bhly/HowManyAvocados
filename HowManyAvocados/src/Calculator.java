/*
	Title: Calculator.java
	@Author: Brynn Haley
	Description: Calculates how many of a GroceryItem can be bought with a specified amount of money entered by the user.
 */
public class Calculator {

	//Amount of money available to purchase with.
	private double dollars;

	public Calculator(double dollars){
		this.dollars = dollars;
	}

	/*
	 * Calculates how many items that can be purchased with a given amount of money.
	 * @param dollars How much money is available.
	 */
	public double calculate(GroceryItem p){
		return dollars/p.getPrice();
	}

	public void setDollars(double dollars){
		this.dollars=dollars;
	}
	
}
		