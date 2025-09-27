import java.util.Scanner;

public class Nokia3310_2{
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
					5-> Show call duration
					6-> Show call costs
					7-> Call cost settings
					8-> Prepaid credit
				""";
				System.out.print(callRegisterMenu);
				
				int callRegister = inputCollector.nextInt();
				switch(callRegister) {
					case 1-> {System.out.print("Missed calls");}
					case 2-> {System.out.print("Received call");}
					case 3-> {System.out.print("Dailled call");}
					case 4-> {System.out.print("Erase recent call lists");}
					case 5-> {
						String callDurationMenu = """
							Show Call duration selected...
							Select an option to proceed

							1-> Last call duration
							2-> All calls' duration
							3-> Received calls; duration
							4-> Dialled calls' duration
							5-> Clear timers
						""";
						System.out.print(callDurationMenu);

						int callDuration = inputCollector.nextInt();
						switch(callDuration){
							case 1-> {System.out.print("Last call duration");}
							case 2-> {System.out.print("All calls' duration");}
							case 3-> {System.out.print("Received calls; duration");}
							case 4-> {System.out.print("Dialled calls' duration");}
							case 5-> {System.out.print("Clear timers");}
						}

					} //end of call duration menu
					case 6-> {
						String callCostMenu = """
							Show call cost selected...
							Select an option to proceed

							1-> Last call cost
							2-> All calls' cost
							3-> Clear counters
						""";
						System.out.print(callCostMenu);

						int callCost = inputCollector.nextInt();
						switch(callCost){
							case 1-> {System.out.print("Last call cost");}
							case 2-> {System.out.print("All calls' cost");}
							case 3-> {System.out.print("Clear counters");}
						}

					} // end of call cost menu
					case 7-> {
						String callCostSettingsMenu = """
							Call cost settings selected...
							Select an option to proceed

							1-> Call cost limit
							2-> Show call cost in
						""";
						System.out.print(callCostSettingsMenu);

						int callCostSettings = inputCollector.nextInt();
						switch(callCostSettings){
							case 1-> {System.out.print("Call cost limit");}
							case 2-> {System.out.print("Show call cost in");}
						}

					} // end of call cost settings menu
					case 8-> {System.out.print("Prepaid credit");}
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
			case 6 -> {
				String settingsMenu = """
					Call register selected...
					Select an option to proceed

					1-> Call settings
					2-> Phone settings
					3-> Security settings
					4-> Restore factory settings
				""";
				System.out.print(settingsMenu);
				
				int settings = inputCollector.nextInt();
				switch(settings) {
					case 1-> {
						String callSettingsMenu = """
							Call settings selected...
							Select an option to proceed

							1-> Automatic redial
							2-> Speed dialiling
							3-> Call waiting options
							4-> Own number sending
							5-> Phone line in use
							6-> Automatic answer
						""";
						System.out.print(callSettingsMenu);

						int callSettings = inputCollector.nextInt();
						switch(callSettings){
							case 1-> {System.out.print("Automatic redial");}
							case 2-> {System.out.print("Speed dialiling");}
							case 3-> {System.out.print("Call waiting options");}
							case 4-> {System.out.print("Own number sending");}
							case 5-> {System.out.print("Phone line in use");}
							case 6-> {System.out.print("Automatic answer");}
						}

					} //end of call settings menu
					case 2-> {
						String phoneSettingsMenu = """
							Phone settings selected...
							Select an option to proceed

							1-> Language
							2-> Cell info display
							3-> Welcome note
							4-> Network selection
							5-> Lights
							6-> Confirm SIM service action
						""";
						System.out.print(phoneSettingsMenu);

						int phoneSettings = inputCollector.nextInt();
						switch(phoneSettings){
							case 1-> {System.out.print("Language");}
							case 2-> {System.out.print("Cell info display");}
							case 3-> {System.out.print("Welcome note");}
							case 4-> {System.out.print("Network selection");}
							case 5-> {System.out.print("Lights");}
							case 6-> {System.out.print("Confirm SIM service action");}
						}
					} // end of phone Settings menu
					case 3-> {
						String securitySettingsMenu = """
							Security settings selected...
							Select an option to proceed

							1-> PIN code request
							2-> Call baring service
							3-> Fixed dialling
							4-> Closed user group
							5-> Phone Security
							6-> Change access codes
						""";
						System.out.print(securitySettingsMenu);

						int securitySettings = inputCollector.nextInt();
						switch(securitySettings){
							case 1-> {System.out.print("PIN code request");}
							case 2-> {System.out.print("Call baring service");}
							case 3-> {System.out.print("Fixed dialling");}
							case 4-> {System.out.print("Closed user group");}
							case 5-> {System.out.print("Phone Security");}
							case 6-> {System.out.print("Change access codes");}
						}
					} // end of security settings menu
					case 4-> {System.out.print("Restore factory settings");}
				}
			} // end of settingsMenu
			case 7 -> {System.out.print("Call divert");}
			case 9 -> {System.out.print("Calculator");}
			case 10 -> {System.out.print("Reminder");}
			case 11 -> {
				String clockMenu = """
					Clock selected...
					Select an option to proceed

					1-> Alarm clock
					2-> Clock settings
					3-> Date settings
					4-> Stopwatch
					5-> Countdown timer
					6-> Auto update of date and time
				""";
				System.out.print(clockMenu);
				int clock = inputCollector.nextInt();
				switch(clock) {
					case 1-> {System.out.print("Alarm clock");}
					case 2-> {System.out.print("Clock settings");}
					case 3-> {System.out.print("Date settings");}
					case 4-> {System.out.print("Stopwatch");}
					case 5-> {System.out.print("Countdown timer");}
					case 6-> {System.out.print("Auto update of date and time");}
				}
			} // end of clock menu
			case 12 -> {System.out.print("Alarm");}
			case 13 -> {System.out.print("SIM services");}

		} // end of mainMenu
	}// end of main method
}// end of main class