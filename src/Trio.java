import java.util.Arrays;


public class Trio implements MenuItem{
	
	private String name;
	private double price;
	
	private double[] array;
	private Sandwich sandwich;
	private Salad salad;
	private Drink drink;
	
	public Trio (Sandwich aSandwich, Salad aSalad, Drink aDrink){
		
		this.sandwich = aSandwich;
		this.salad = aSalad;
		this.drink = aDrink;
		this.name = aSandwich.getName() +"/" + aSalad.getName() + "/" + aDrink.getName() + " Trio";
		array[0] = aSandwich.getPrice();
		array[1] = aSalad.getPrice();
		array[2] = aDrink.getPrice();
		Arrays.sort(array);
		if (array[0] == aSandwich.getPrice()){
			this.price = aDrink.getPrice() + aSalad.getPrice();
		}
		else if (array[0] == aSalad.getPrice()) {
			this.price = aSandwich.getPrice() + aDrink.getPrice();
		}
		else if (array[0] == aDrink.getPrice()) {
			this.price = aSandwich.getPrice() + aSalad.getPrice();
		}
		else {
			this.price = aSandwich.getPrice() + aSalad.getPrice();
		}
		
		
		
	}
	
	public String getName() {
		return null;
	}
	
	public double getPrice() {
		return 0;
	}
	

}
