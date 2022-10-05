package PizzaPastaSystemDesign;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
	
	PizzaSize pizzaSize;
	PizzaType crustSize;
	PizzaFlavors pizzaFlavor;
	List<PizzaToppings> toppings;
	
	Pizza(PizzaSize pizzaSize, PizzaType crustSize, PizzaFlavors pizzaFlavor){
		this.pizzaSize = pizzaSize;
		this.crustSize = crustSize;
		this.pizzaFlavor = pizzaFlavor;
		this.toppings = new ArrayList<>();
	}

	public Pizza() {
		this.toppings = new ArrayList<>();
	}

	public void setPizzaSize(PizzaSize pizzaSize) {
		this.pizzaSize = pizzaSize;
	}

	public void setCrustSize(PizzaType crustSize) {
		this.crustSize = crustSize;
	}

	public void setPizzaFlavor(PizzaFlavors pizzaFlavor) {
		this.pizzaFlavor = pizzaFlavor;
	}

	public void addToppings(PizzaToppings pizzaTopping) {
		this.toppings.add(pizzaTopping);
	}

	public PizzaSize getPizzaSize() {
		return pizzaSize;
	}

	public PizzaType getCrustSize() {
		return crustSize;
	}

	public PizzaFlavors getPizzaFlavor() {
		return pizzaFlavor;
	}
	
	public List<PizzaToppings> getToppings() {
		return toppings;
	}

	public int getToppingsListSize() {
		return toppings.size();
	}
}
