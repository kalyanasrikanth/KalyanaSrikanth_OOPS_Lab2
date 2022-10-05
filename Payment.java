package PizzaPastaSystemDesign;

public class Payment {
	
	public static void payment(Order order) {
		double amount = 0;
		if(order.getSelectedFood() == FoodOption.PIZZA) {
			if(order.getPizza().getPizzaFlavor() == PizzaFlavors.VEG) {
				if(order.getPizza().getPizzaSize() == PizzaSize.LARGE) {
					amount += 60;
				}else if(order.getPizza().getPizzaSize() == PizzaSize.MEDIUM) {
					amount += 40;
				}else if(order.getPizza().getPizzaSize() == PizzaSize.SMALL) {
					amount += 20;
				}				
			}
			if(order.getPizza().getPizzaFlavor() == PizzaFlavors.NonVEG) {
				if(order.getPizza().getPizzaSize() == PizzaSize.LARGE) {
					amount += 75;
				}else if(order.getPizza().getPizzaSize() == PizzaSize.MEDIUM) {
					amount += 50;
				}else if(order.getPizza().getPizzaSize() == PizzaSize.SMALL) {
					amount += 25;
				}				
			}
			if(order.getPizza().getPizzaFlavor() == PizzaFlavors.VEGAN) {
				if(order.getPizza().getPizzaSize() == PizzaSize.LARGE) {
					amount += 45;
				}else if(order.getPizza().getPizzaSize() == PizzaSize.MEDIUM) {
					amount += 30;
				}else if(order.getPizza().getPizzaSize() == PizzaSize.SMALL) {
					amount += 15;
				}				
			}
			amount += order.getPizza().getToppingsListSize();
		}else {
			if(order.getPasta().getPastaFlavor() == PastaFlavors.RedSauce) {
				amount += 10;
			}else {
				amount += 20;
			}
		}
		
		System.out.println("Final Amount = "+amount);
	}

}
