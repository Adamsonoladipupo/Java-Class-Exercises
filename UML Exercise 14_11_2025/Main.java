import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner inputCollector = new Scanner(System.in);

		Problem problemOne = new Problem("Sapa", "Financial");

		System.out.println("Problem name: " + problemOne.getProblemName() + " | Problem type : " + problemOne.getProblemType());
		
		System.out.print("Change problem Name: ");
		String userInput = inputCollector.nextLine();
		problemOne.setProblemName(userInput);

		System.out.println("Problem name: " + problemOne.getProblemName() + " | Problem type : " + problemOne.getProblemType());


		Person personOne = new Person();

		personOne.setProblem(problemOne);

		System.out.println("Person 1 : " + personOne.getPersonProblems());
	}
}