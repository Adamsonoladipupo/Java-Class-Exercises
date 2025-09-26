import java.util.Scanner;

public class Breakfast {
public static void main (String[] args){

// Create scanner to collect users inputs
Scanner input = new Scanner(System.in);

// Collecting First student's Data
System.out.print("Enter First Student's name:"); // prompt users to first name
String FirstStudentName = input.nextLine();
System.out.print("Enter First Student's scores:"); // prompt users to first student scores
int FirstStudentScores = input.nextInt();

// Collecting Second student's Data
System.out.print("Enter Second Student's name:"); // prompt users to first name
String SecondStudentName = input.next();
System.out.print("Enter second Student's scores:"); // prompt users to second student scores
int SecondStudentScores = input.nextInt();

// Collecting First student's Data
System.out.print("Enter Third Student's name:"); // prompt users to third name
String ThirdStudentName = input.next();
System.out.print("Enter Third Student's scores:"); // prompt users to third student scores
int ThirdStudentScores = input.nextInt();


// IF STATEMENTS
if (FirstStudentScores > SecondStudentScores && FirstStudentScores > ThirdStudentScores ){
System.out.printf("%s has the highest score of %d%n", FirstStudentName, FirstStudentScores);
}


if (SecondStudentScores > FirstStudentScores && SecondStudentScores > ThirdStudentScores ){
System.out.printf("%s has the highest score of %d%n", SecondStudentName, SecondStudentScores);
}

if (ThirdStudentScores > SecondStudentScores && ThirdStudentScores > FirstStudentScores ){
System.out.printf("%s has the highest score of %d%n", ThirdStudentName, ThirdStudentScores);
}

}
}