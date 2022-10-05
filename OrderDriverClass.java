package PizzaPastaSystemDesign;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class OrderDriverClass {

	public static void main(String[] args) {
		Queue<Order> orderList = new LinkedList<>();
		
		Scanner keyboard = new Scanner(System.in);
		int optionsMenuSelected;
		do {
			optionsMenuSelected = optionsMenu(keyboard);
			if(optionsMenuSelected == 1) {
				foodMenuBuilder(keyboard, orderList);
			}else if(optionsMenuSelected == 2) {
				if(orderList.size()>0) {
					KitchenUpdateMenuBuilder(keyboard, orderList);
				}else {
					System.out.println("No orders in queue currently.");
				}
			}else if(optionsMenuSelected == 3) {
				if(orderList.size()>0) {
					if(orderList.peek().getKitchenStatus() == KitchenStatus.COMPLETED) {
						Payment.payment(orderList.peek());
						orderList.remove();
					}else {
						System.out.println("Order not ready yet");
					}
				}else {
					System.out.println("No orders in queue currently.");
				}
			}else if(optionsMenuSelected !=4 ){
				System.out.println("Invalid selection. Please try again.");
			}else {
				break;
			}
		}while(optionsMenuSelected != 4);
		
		System.out.println("Orders in queue: "+orderList.size());
		orderList.remove();
		System.out.println("Orders in queue after removal: "+orderList.size());
		System.out.println(orderList.peek().toString());
		
	}
	
	public static int foodMenu(Scanner keyboard) {
		System.out.println("Food Menu:");
		System.out.println("1. Pizza");
		System.out.println("2. Pasta");
		return keyboard.nextInt();
	}
	
	public static void foodMenuBuilder(Scanner keyboard, Queue<Order> orderList) {
		int foodMenuSelection;
		
		do {
			foodMenuSelection = foodMenu(keyboard);
			if(foodMenuSelection == 1) {
				orderList.add(new Order(PizzaOrderBuilder.PizzaOrderBuilding(keyboard)));
			}else if(foodMenuSelection == 2) {
				orderList.add(new Order(PastaOrderBuilder.pastaOrderBuilding(keyboard)));
			}else {
				System.out.println("Invalid selection. Please try again.");
			}
		}while((foodMenuSelection<0)||(foodMenuSelection>2));
		
		System.out.println(orderList.peek().toString());
	}
	
	public static void KitchenUpdateMenuBuilder(Scanner keyboard, Queue<Order> orderList) {
		int kitchenUpdateMenuSelected;
		
		do {
			kitchenUpdateMenuSelected = kitchenUpdateMenu(keyboard);
			if(kitchenUpdateMenuSelected == 1) {
				if(orderList.peek().getKitchenStatus() == KitchenStatus.NotStarted) {
					KitchenStatusUpdate.statusUpdate(orderList.peek(), KitchenStatus.InProgress);
				}
			}else if(kitchenUpdateMenuSelected == 2) {
				if(orderList.peek().getKitchenStatus() == KitchenStatus.InProgress) {
					KitchenStatusUpdate.statusUpdate(orderList.peek(), KitchenStatus.COMPLETED);
				}
			}else {
				System.out.println("Invalid selection. Please try again.");
			}
		}while((kitchenUpdateMenuSelected<0)||(kitchenUpdateMenuSelected>2));
		
		System.out.println(orderList.peek().toString());
	}
	
	public static int optionsMenu(Scanner keyboard) {
		System.out.println("List of Options:");
		System.out.println("1. Food Menu");
		System.out.println("2. Kitchen Status");
		System.out.println("3. Payment");
		System.out.println("4. Exit");
		return keyboard.nextInt();
	}
	
	public static int kitchenUpdateMenu(Scanner keyboard) {
		System.out.println("List of Kitchen Update Options:");
		System.out.println("1. Start next Order in Queue");
		System.out.println("2. Order in queue completed");
		System.out.println("3. Exit");
		return keyboard.nextInt();
	}
	
}
