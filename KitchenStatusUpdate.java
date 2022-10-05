package PizzaPastaSystemDesign;

public class KitchenStatusUpdate {
	public static void statusUpdate(Order order, KitchenStatus kitchenStatus) {
		order.setKitchenStatus(kitchenStatus);
	}
}
