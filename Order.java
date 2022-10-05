package PizzaPastaSystemDesign;

public class Order {
	
	int tokenNumber;
	static int OrderCounter=0;
	FoodOption selectedFood;
	Pizza pizza;
	Pasta pasta;
	static String toPrint;
	KitchenStatus kitchenStatus;
	
	Order(Pizza pizza){
		OrderCounter++;
		this.tokenNumber = OrderCounter;
		this.selectedFood = FoodOption.PIZZA;
		this.pizza = pizza;
		this.kitchenStatus = KitchenStatus.NotStarted;
		toPrint = "Token Number: " +this.tokenNumber+ "\n Food Ordered: " +selectedFood
				+"\n Pizza Type: "+pizza.getCrustSize()+"\n Pizza Flavor: "+pizza.getPizzaFlavor()
				+"\n Pizza Size: "+pizza.getPizzaSize()+"\n Pizza Toppings count: "+pizza.getToppingsListSize();
	
	}
	
	Order (Pasta pasta){
		OrderCounter++;
		this.tokenNumber = OrderCounter;
		this.selectedFood = FoodOption.PASTA;
		this.pasta = pasta;
		this.kitchenStatus = KitchenStatus.NotStarted;
		toPrint = "Token Number: " +this.tokenNumber+ "\n Food Ordered: " +selectedFood
				+"\n Pasta Type: "+pasta.getPastaType()+"\n Pasta Flavor: "+pasta.getPastaFlavor();
	}
	
	@Override
	public String toString(){
		return toPrint;
	}
	
	public int getTokenNumber() {
		return tokenNumber;
	}

	public static int getOrderCounter() {
		return OrderCounter;
	}

	public FoodOption getSelectedFood() {
		return selectedFood;
	}

	public Pizza getPizza() {
		return pizza;
	}

	public Pasta getPasta() {
		return pasta;
	}

	public static String getToPrint() {
		return toPrint;
	}
	
	public void setKitchenStatus(KitchenStatus kitchenStatus) {
		this.kitchenStatus = kitchenStatus;
	}
	
	public KitchenStatus getKitchenStatus() {
		return kitchenStatus;
	}
}
