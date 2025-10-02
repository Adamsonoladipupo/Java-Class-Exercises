import java.util.Scanner;

public class Test{
	public static void main(String[] args){
		Scanner inputCollector = new Scanner(System.in);

		// public static String MainMenuMethod( String mainMenuMenu){

		String mainMenu = """
			Welcome to main menu ...
			make a selection to proceed
			
			1-> Call
			2-> Message
			3-> Camera
			4-> Settings
			0-> Exit
		""";
		System.out.print(mainMenu);

		int mainMenuMenu = inputCollector.nextInt();
		switch (mainMenuMenu){
			case 1-> {
				String docCall = """
					Call selected ...
					Make a selection to proceed

					1-> Keypad
					2-> Recent calls
					3-> Contact
					0-> Exit
				""";
				System.out.print(docCall);

				int call = inputCollector.nextInt();
				switch (call){
					case 1-> {System.out.print("Keypad");}
					case 2-> {System.out.print("Recent calls");}
					
			
					case 3-> {

						System.out.println("Contact Page: 08122713205");
						String docContact = """

							0 -> Exit 

						""";
						System.out.print(docContact);
						
					}
					default -> {System.out.println("Invalid Input, \nSelect from the options above");}
				}
				} // end of while loop
			}// end call switch
			case 2-> {System.out.print("Message");}
			case 3-> {System.out.print("Camera");}
			case 4-> {
				String docSettings = """
					Settings sellected ...
					Make a selection to proceed

					1-> Display
					2-> Notification
					0-> Exit
				""";
				System.out.print(docSettings);
				int settings = inputCollector.nextInt();
				switch (settings){
					case 1-> {
						String docTheme = """
							Theme selected ...
							Make a selection to proceed

							1-> Dark
							2-> Light
							0-> Exit
						""";
						System.out.print(docTheme);
						int theme = inputCollector.nextInt();
						switch (theme){
							case 1-> {System.out.print("Dark! Selected");}
							case 2-> {System.out.print("Light! Selected");}
							default -> {System.out.println("Invalid Input, \nSelect from the options above");}
						}
					}
					case 2-> {System.out.print("Notification");}
					default -> {System.out.println("Invalid Input, \nSelect from the options above");}
				}
			} //end of settings
			default -> {System.out.println("Invalid Input, \nSelect from the options above");}
		}// end of mainMenuMenu
		//) // end of method MAinMenuMethod
		
		System.out.print("testing");
		
	}
}