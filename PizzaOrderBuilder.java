package PizzaPastaSystemDesign;

import java.util.Scanner;

public class PizzaOrderBuilder {

	public static Pizza PizzaOrderBuilding(Scanner keyboard) {
		Pizza pizza = new Pizza();
		int pizzaSizeMenuSelection;
		do {
			pizzaSizeMenuSelection = pizzaSizeMenu(keyboard);
			if(pizzaSizeMenuSelection == 1) {
				pizza.setPizzaSize(PizzaSize.LARGE);
			}else if(pizzaSizeMenuSelection == 2) {
				pizza.setPizzaSize(PizzaSize.MEDIUM);
			}else if(pizzaSizeMenuSelection == 3) {
				pizza.setPizzaSize(PizzaSize.SMALL);
			}else {
				System.out.println("Invalid selection. Please try again.");
			}
		}while((pizzaSizeMenuSelection<0)||(pizzaSizeMenuSelection>3));
		
		int pizzaTypeMenuSelection;
		do {
			pizzaTypeMenuSelection = pizzaTypeMenu(keyboard);
			if(pizzaTypeMenuSelection == 1) {
				pizza.setCrustSize(PizzaType.THICK);
			}else if(pizzaTypeMenuSelection == 2) {
				pizza.setCrustSize(PizzaType.THIN);
			}else {
				System.out.println("Invalid selection. Please try again.");
			}
		}while((pizzaTypeMenuSelection<0)||(pizzaTypeMenuSelection>2));
		
		int pizzaFlavorsMenuSelection;
		do {
			pizzaFlavorsMenuSelection = pizzaFlavorsMenu(keyboard);
			if(pizzaTypeMenuSelection == 1) {
				pizza.setPizzaFlavor(PizzaFlavors.VEG);
			}else if(pizzaTypeMenuSelection == 2) {
				pizza.setPizzaFlavor(PizzaFlavors.NonVEG);
			}else if(pizzaTypeMenuSelection == 3) {
				pizza.setPizzaFlavor(PizzaFlavors.VEGAN);
			}else {
				System.out.println("Invalid selection. Please try again.");
			}
		}while((pizzaFlavorsMenuSelection<0)||(pizzaFlavorsMenuSelection>3));
		
		int pizzaToppingsMenuSelection;
		do {
			pizzaToppingsMenuSelection = pizzaToppingsMenu(keyboard);
			if(pizzaToppingsMenuSelection == 1) {
				if(!pizza.getToppings().contains(PizzaToppings.CHEESE)) {
					pizza.addToppings(PizzaToppings.CHEESE);
				}else {
					System.out.println("Its already added.");
				}
			}else if(pizzaToppingsMenuSelection == 2) {
				if(!pizza.getToppings().contains(PizzaToppings.MUSHROOM)) {
					pizza.addToppings(PizzaToppings.MUSHROOM);
				}else {
					System.out.println("Its already added.");
				}
			}else if(pizzaToppingsMenuSelection == 3) {
				if(!pizza.getToppings().contains(PizzaToppings.TOMATO)) {
					pizza.addToppings(PizzaToppings.TOMATO);
				}else {
					System.out.println("Its already added.");
				}
			}else if(pizzaToppingsMenuSelection == 4) {
				if(!pizza.getToppings().contains(PizzaToppings.JALAPENO)) {
					pizza.addToppings(PizzaToppings.JALAPENO);
				}else {
					System.out.println("Its already added.");
				}
			}else if(pizzaToppingsMenuSelection == 5) {
				if(!pizza.getToppings().contains(PizzaToppings.SPINACH)) {
					pizza.addToppings(PizzaToppings.SPINACH);
				}else {
					System.out.println("Its already added.");
				}
			}else if(pizzaToppingsMenuSelection != 6) {
				System.out.println("Invalid selection. Please try again.");
			}else {
				break;
			}
		}while(pizzaFlavorsMenuSelection!=6);
		
		return pizza;
	}
	
	public static int pizzaSizeMenu(Scanner keyboard){
		System.out.println("Pizza Size Menu:");
		System.out.println("1. Large");
		System.out.println("2. Medium");
		System.out.println("3. Small");
		return keyboard.nextInt();
	}
	
	public static int pizzaTypeMenu(Scanner keyboard){
		System.out.println("Pizza Type Menu:");
		System.out.println("1. Thick");
		System.out.println("2. Thin");
		return keyboard.nextInt();
	}
	
	public static int pizzaFlavorsMenu(Scanner keyboard){
		System.out.println("Pizza Flavors Menu:");
		System.out.println("1. Veg");
		System.out.println("2. Non-Veg");
		System.out.println("3. Vegan");
		return keyboard.nextInt();
	}
	
	public static int pizzaToppingsMenu(Scanner keyboard){
		System.out.println("Pizza Toppings Menu:");
		System.out.println("1. Cheese");
		System.out.println("2. Mushroom");
		System.out.println("3. Tomato");
		System.out.println("4. Jalapeno");
		System.out.println("5. Spinach");
		System.out.println("6. Exit");
		return keyboard.nextInt();
	}
}
