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
			case 2 -> {
				String messageMenu = """
					Messages selected...
					Select an option to proceed

					1-> Write messages
					2-> Inbox
					3-> Outbox
					4-> Picture messages
					5-> Templates
					6-> Smileys
					7-> Message settings
					8-> Info service
					9-> Voice mailbox number
					10-> Service command editor
				""";
				System.out.print(messageMenu);

				int messages = inputCollector.nextInt();
				switch(messages) {
					case 1-> {System.out.print("Write message");}
					case 2-> {System.out.print("Inbox");}
					case 3-> {System.out.print("Outbox");}
					case 4-> {System.out.print("Picture messages");}
					case 5-> {System.out.print("Template");}
					case 6-> {System.out.print("Smileys");}
					case 7-> {
						String messageSettingMenu = """
							Message settings selected...
							Select an option to proceed

							1-> Set1
							2-> Common
						""";
						System.out.print(messageSettingMenu);

						int messageSettings = inputCollector.nextInt();
						switch(messageSettings){
							case 1-> {
								String set1Menu = """
									Set1 Selcted...
									Select an option to proceed
									
									1-> Message centre number
									2-> Message sent as
									3-> Message validity
								""";
								System.out.print(set1Menu);
								
								int set1 = inputCollector.nextInt();
								switch(set1){
									case 1-> {System.out.print("Message centre number");}
									case 2-> {System.out.print("Message sent as");}
									case 3-> {System.out.print("Message validity");}
								}
							} //end of set1Menu 
							case 2-> {
								String commonMenu = """
									Common Selcted...
									Select an option to proceed
									
									1-> Delivery report
									2-> Reply via same centre
									3-> Character support
								""";
								System.out.print(commonMenu);
								
								int common = inputCollector.nextInt();
								switch(common){
									case 1-> {System.out.print("Delivery report");}
									case 2-> {System.out.print("Reply via same centre");}
									case 3-> {System.out.print("Character support");}
								}
							} //end of commonMenu 
						}
					} //end of messageSettingMenu
					case 8-> {System.out.print("Info service");}
					case 9-> {System.out.print("Voice mailbox numbe");}
					case 10-> {System.out.print("Service command editor");}
				}

			}
			case 3 -> {System.out.print("Chat");}
			case 4 -> {
				String callRegisterMenu = """
					Call register selected...
					Select an option to proceed

					1-> Missed calls
					2-> Received call
					3-> Dailled call
					4-> Erase recent call lists
				""";
				System.out.print(callRegisterMenu);
				
				int callRegister = inputCollector.nextInt();
				switch(callRegister) {
					case 1-> {System.out.print("Missed calls");}
					case 2-> {System.out.print("Received call");}
					case 3-> {System.out.print("Dailled call");}
					case 4-> {System.out.print("Erase recent call lists");}
				}
			} // end of callRegisterMenu
			case 5 -> {
				String toneMenu = """
					Tones selected...
					Select an option to proceed

					1-> Ringing tone
					2-> Ringing Volume
					3-> Incoming call alert
					4-> Composer
					5-> Message alert tone
					6-> Keypad tones
					7-> Warning and game tones
					8-> Vibrating alert
					9-> Screen saver
				""";
				System.out.print(toneMenu);
				
				int tones = inputCollector.nextInt();
				switch(tones) {
					case 1-> {System.out.print("Ringing tone");}
					case 2-> {System.out.print("Ringing volume");}
					case 3-> {System.out.print("Incoming call alert");}
					case 4-> {System.out.print("Composer");}
					case 5-> {System.out.print("Message alert tone");}
					case 6-> {System.out.print("Keypad tones");}
					case 7-> {System.out.print("Warning and game tones");}
					case 8-> {System.out.print("Vibration alert");}
					case 9-> {System.out.print("Screen saver");}
				}
			} // end of toneMenu
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