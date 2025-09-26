/*
Pseudo code
- display a welcome message highlighting what the app is for
- ask the user to enter a letter from 
- store the entered value in a variable
- check if the entered value is equals to A or B or C or D, print "you pass" if not
- check if the entered value is equals to F, print "you fail" if not
- print, Invalid
*/
import java.util.Scanner;

public class GradingWithLetterA_F{
public static void main(String[] args){

System.out.println("Welcome! This app helps you know if you pass or fail based on your grade letter ");
Scanner input = new Scanner(System.in);

System.out.print("Enter your grade letter: ");
String letter = input.nextLine();

// computation
if ( letter.equalsIgnoreCase("A") || letter.equalsIgnoreCase("B") || letter.equalsIgnoreCase("C") || letter.equalsIgnoreCase("D") ){
System.out.print("You pass");
} if ( letter.equalsIgnoreCase("F")){System.out.print("You fail");}
else {System.out.print("Invalid");}


}
}