/*
	Title: Calculator.java
	@Author: Brynn Haley
	Description: Calculates how many Purchasables can be bought with a specified amount of money entered by the user.
 */
public class Calculator {

	//Amount of money available to purchase avocados with.
	private double dollars;

	public Calculator(double dollars){
		this.dollars = dollars;
	}

	/*
	 * Calculates how many avocados that can be purchased with a given amount of money.
	 * @param dollars How much money is available.
	 * @param sale True if avocados are on sale, false if not.
	 */
	public double calculate(GroceryItem p){
		return dollars/p.getPrice();
	}

	public void setDollars(double dollars){
		this.dollars=dollars;
	}
	
}
		