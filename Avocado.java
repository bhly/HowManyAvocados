
public class Avocado{

	private double dollars;
	private double avocados;
	private boolean sale = false;

	public Avocado(double dollars){
		this.dollars = dollars;
	}
	
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
		