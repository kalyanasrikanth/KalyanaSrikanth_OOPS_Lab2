package PizzaPastaSystemDesign;

public class Pasta {
	PastaType pastaType;
	PastaFlavors pastaFlavor;
	
	Pasta(PastaType pastaType, PastaFlavors pastaFlavor){
		this.pastaType = pastaType;
		this.pastaFlavor = pastaFlavor;
	}
	
	Pasta(){
		
	}

	public PastaType getPastaType() {
		return pastaType;
	}

	public void setPastaType(PastaType pastaType) {
		this.pastaType = pastaType;
	}

	public PastaFlavors getPastaFlavor() {
		return pastaFlavor;
	}

	public void setPastaFlavor(PastaFlavors pastaFlavor) {
		this.pastaFlavor = pastaFlavor;
	}
	
}
