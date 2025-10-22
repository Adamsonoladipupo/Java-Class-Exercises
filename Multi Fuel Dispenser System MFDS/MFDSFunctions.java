public class MFDSFunctions{
	public static void main(String[] args){	
	}
	public static int buyPetrolWithPrice(int price){
		int liter = price / 650;
		return liter;
	}

	public static int buyPetrolWithLiter(int liter){
		int price = liter * 650;
		return price;
	}



}