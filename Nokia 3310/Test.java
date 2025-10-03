import java.util.Scanner;

public class Test{
	public static void main(String[] args){
		String mMenu = "100";

		while (!mMenu.equalsIgnoreCase("0")){
		if (!mMenu.equalsIgnoreCase("0")){
		String docstring = """
			
			Welcome to the phone Menu App ...
			Select an option to proceed.
			
			1-> Enter Phone Settings
			0-> Exit
		""";
		System.out.print(docstring);
		Scanner input = new Scanner(System.in);
		mMenu = input.nextLine();
		switch(mMenu){
			case "1"-> {
				System.out.print("Welcome to Phone Settings");
				PhoneSettings();
				
			}
			default -> {
				System.out.println("Invalid Entry, please select from the menu options");
			}
			case "0"-> { mMenu = "0"; }
		}
		} // end of it statement
		} // end of while loop
	}

	public static void PhoneSettings(){
		String phoneString = """
			
			Phone Settings Selected ...
			Make a selection to proceed

			1-> Dispay 
			2-> Connectivity
			22-> Back
			0-> Exit
		""";
		System.out.print(phoneString);
		
	}
}