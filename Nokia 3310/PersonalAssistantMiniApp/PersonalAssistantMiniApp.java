import java.util.Scanner;

public class PersonalAssistantMiniApp{
public static void main(String[] args){
// collection data from the user
Scanner input = new Scanner(System.in);
System.out.print("Enter your name: ");
String Name = input.nextLine();
System.out.print("Enter your age: ");
int Age = input.nextInt();
System.out.print("How are you feeling today? (happy, sad, excited, tired):  ");
String Mood = input.next();
System.out.print("Guess a number between 1 - 10: ");
int GuessNumber = input.nextInt();
System.out.print("Do you want any suggestion for today? (yes or no): ");
String Suggestion = input.next();

System.out.printf("Hello, %s Welcome to your personal assistant App.%n", Name);

// computation and collecting data
// checking for age
if (Age >= 60){
System.out.println("Wisdom looks good on you!");
}
else if (Age >= 20){
System.out.println("Adulting can be challenging, stay strong!");
}
else if (Age >= 13){
System.out.println("Teen life is fun, enjoy it!");
}
else if (Age < 13){
System.out.println("You are a young explorer!");
}

// checking for mood
if (Mood.equalsIgnoreCase("happy")){
System.out.println("Keep smiling!");
} else if (Mood.equalsIgnoreCase("sad")){
System.out.println("Cheer up! Tomorrow is a new day.");
}
else if (Mood.equalsIgnoreCase("excited")){
System.out.println("Awesome! Enjoy your energy!");
}
else if (Mood.equalsIgnoreCase("tired")){
System.out.println("Rest well and recharge!");
}

// Guess question, pick a number
if ( GuessNumber == 3 ){
System.out.println("Wow! You guessed it!");
} else if ( GuessNumber != 3 ){
System.out.println("Try again next time!");
}

// Suggestions based on the mood
if ( Suggestion.equalsIgnoreCase("no")){
	System.out.println("No worries! Have a great day anyway!");
	} else if ( Suggestion.equalsIgnoreCase("yes")){
		if (Mood.equalsIgnoreCase("happy")){
		System.out.println("Here’s a suggestion for you today: Go out and play a sport you like!");
		}
		else if (Mood.equalsIgnoreCase("sad")){
		System.out.println("Here’s a suggestion for you today: Take a short walk outside and get some fresh air");
		}
		else if (Mood.equalsIgnoreCase("excited")){
		System.out.println("Here’s a suggestion for you today: Share your excitement by helping someone!");
		}
		else if (Mood.equalsIgnoreCase("tired")){
		System.out.println("Here’s a suggestion for you today: Have a short nap or rest to recharge.");
	}
}

}
}