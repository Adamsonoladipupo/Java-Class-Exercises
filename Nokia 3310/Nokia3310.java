import java.util.Scanner;

public class Nokia3310{
	public static void main(String[] args){
		String nokia3310Menu = """
			Welcome! Select an option to get started
			
			1-> Phone book
			2-> Messages
			3-> Chat
			4-> Call register
			5-> Tones
			6-> Settings
			7-> Call divert
			8-> Games
			9-> Calculator
			10-> Reminders
			11-> Clock
			12-> Alarm
			13-> SIM services
		""";
		System.out.println(nokia3310Menu);
		
		Scanner inputCollector = new Scanner(System.in);
		int mainMenu = inputCollector.nextInt();
		
		switch(mainMenu) {
			case 1 -> {
				String phoneBookMenu = """
					Phone book selected...
					Select an option to proceed
					1-> Search
					2-> Services number
					3-> Add name
					4-> Erase
					5-> Edit
					6-> Assign tone
					7-> Send b'card
					8-> Options
					9-> Speed dials
					10-> Voice tags
				""";
				System.out.print(phoneBookMenu);

				int phoneBook = inputCollector.nextInt();
				
				switch(phoneBook){
					case 1-> {System.out.print("Search");}
					case 2-> {System.out.print("Services number");}
					case 3-> {System.out.print("Add number");}
					case 4-> {System.out.print("Erase");}
					case 5-> {System.out.print("Edit");}
					case 6-> {System.out.print("Assign tone");}
					case 7-> {System.out.print("Send b'card");}
					case 8-> {
						String optionMenu = """
							Options selected...
							Select an option to proceed
							1-> Type of view
							2-> Memory Status
						""";
						System.out.print(optionMenu);

						int options = inputCollector.nextInt();
						switch(options){
							case 1-> {System.out.print("Type of view");}
							case 2-> {System.out.print("Memory statuc");}
						}
					} // end of optionMenu
					case 9-> {System.out.print("Speed dials");}
					case 10-> {System.out.print("Voice tags");}
				}
				
			} // end of phoneBookMenu
			case 2 -> {System.out.print("Messages");}
			case 3 -> {System.out.print("Chat");}
			case 4 -> {System.out.print("Call register");}
			case 5 -> {System.out.print("Tones");}
			case 6 -> {System.out.print("Settings");}
			case 7 -> {System.out.print("Call divert");}
			case 9 -> {System.out.print("Calculator");}
			case 10 -> {System.out.print("Reminder");}
			case 11 -> {System.out.print("Clock");}
			case 12 -> {System.out.print("Alarm");}
			case 13 -> {System.out.print("SIM services");}

		} // end of mainMenu
	}// end of main method
}// end of main class