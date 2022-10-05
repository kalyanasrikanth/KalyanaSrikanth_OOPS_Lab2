package PizzaPastaSystemDesign;

import java.util.Scanner;

public class PastaOrderBuilder {
	public static Pasta pastaOrderBuilding(Scanner keyboard) {
		Pasta pasta = new Pasta();
		
		int pastaTypeMenuSelection;
		do {
			pastaTypeMenuSelection = pastaTypeMenu(keyboard);
			if(pastaTypeMenuSelection == 1) {
				pasta.setPastaType(PastaType.PENNE);
			}else if(pastaTypeMenuSelection == 2) {
				pasta.setPastaType(PastaType.DITALINI);
			}else {
				System.out.println("Invalid selection. Please try again.");
			}
		}while((pastaTypeMenuSelection<0)||(pastaTypeMenuSelection>2));
		
		int pastaFlavorsMenuSelection;
		do {
			pastaFlavorsMenuSelection = pastaFlavorsMenu(keyboard);
			if(pastaTypeMenuSelection == 1) {
				pasta.setPastaFlavor(PastaFlavors.WhiteSauce);
			}else if(pastaTypeMenuSelection == 2) {
				pasta.setPastaFlavor(PastaFlavors.RedSauce);
			}else {
				System.out.println("Invalid selection. Please try again.");
			}
		}while((pastaFlavorsMenuSelection<0)||(pastaFlavorsMenuSelection>3));
		
		return pasta;
	}
	
	public static int pastaTypeMenu(Scanner keyboard){
		System.out.println("Pasta Type Menu:");
		System.out.println("1. Penne");
		System.out.println("2. Ditalini");
		return keyboard.nextInt();
	}
	
	public static int pastaFlavorsMenu(Scanner keyboard){
		System.out.println("Pasta Flavors Menu:");
		System.out.println("1. White Sauce");
		System.out.println("2. Red Sauce");
		return keyboard.nextInt();
	}
	
}
