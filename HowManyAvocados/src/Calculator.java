/*
	Title: Calculator.java
	@Author: Brynn Haley
	Description: Calculates how many avocados can be bought with a specified amount of money entered by the user.
 */
public class Calculator {

	//Amount of money available to purchase avocados with.
	private double dollars;
	//number of avocados that can be bought.
	private double avocados;
	//True if avocados are on sale, false if not.
	private boolean sale = false;

	public Calculator(double dollars){
		this.dollars = dollars;
	}

	/*
	 * Calculates how many avocados that can be purchased with a given amount of money.
	 * @param dollars How much money is available.
	 * @param sale True if avocados are on sale, false if not.
	 */
	public void calculate(double dollars, boolean sale){
		if(!sale)
			avocados = dollars/2;
		else
			avocados = dollars/1.5;
	}

	public void setDollars(double dollars){
		this.dollars=dollars;
	}
	
	public void setSale(boolean sale){
		this.sale=sale;
	} 
	
	public boolean getSale(){
		return sale;
	}
	
	public double getDollars(){
		return dollars;
	}
	
	public double getAvocados(){
		return avocados;
	}
	
}
		