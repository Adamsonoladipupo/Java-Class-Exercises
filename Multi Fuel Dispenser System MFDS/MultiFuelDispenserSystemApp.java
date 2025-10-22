import java.util.Scanner;

public class MultiFuelDispenserSystemApp{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int mainOption = 0;
		while (mainOption != 3){

		int price = 0;
		int liter = 0;
		String docMain = """

		Welcome to  GBeda Station !
	
		Available petroleum
		1. Buy Petroleum
		2. Show Transaction History
		3. Exit

		""";
		
		System.out.print(docMain);
		System.out.print("Enter operation: ");
		mainOption = input.nextInt();
		switch(mainOption){
			case 1-> {
				String docPetroleum = """

		Available petroleum
		1. Petrol --> 650 / Liter
		2. Diesel --> 720 /Liter
		3. Kerosene --> 550 /Liter
		4. Gas --> 480 /Liter

				""";
				System.out.print(docPetroleum);
				System.out.print("Enter operation: ");
				int petroleum = input.nextInt();
				switch(petroleum){
					case 1-> {
						System.out.print("choose buy option (amount or liter): ");
						String options = input.next();
		
						if (options.equalsIgnoreCase("amount")){
							System.out.print("How much petrol are you buying: ");
							price = input.nextInt();
							liter = MFDSFunctions.buyPetrolWithPrice(price);
						}
						if (options.equalsIgnoreCase("liter")){
							System.out.print("How many liter(s) of petrol are you buying: ");
							liter = input.nextInt();
							price = MFDSFunctions.buyPetrolWithLiter(liter);
						}
						String receipt = String.format("""
							
		Customers Transaction Receipt
		==================================
		= Product : Petrol        
		= Amount : %d        
		= Liters : %dL
		= Thank you For your Petronage  
		==================================
		Saving Transaction History. . . .
						""", price, liter);
						System.out.print(receipt);
					
					}

				}
			}
			case 2-> System.out.print("Show Transaction History");
			case 3-> {
				System.out.print("Thank you for visiting GBeda Station! ");
				break;
			}
			default -> {System.out.print("choose from the options above, abi make I wipe you cord for head! ");}
		}
		} // end of while loop
	}
}