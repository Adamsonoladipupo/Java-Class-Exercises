/*
Pseudo code
- display a welcome message highlighting what the app is for
- ask the user to enter two inputs
- store the entered value in a variable
- check if the entered values are greater than equals to 75, print "You are eligible", if not
- print "you are not eligible"
*/

import java.util.Scanner;

public class StudentEligibility{
public static void main(String[] args){
System.out.println("Welcome! This app helps you know your eligibility");
Scanner input = new Scanner(System.in);
System.out.print("Enter your attendance percentage: ");
int attendance = input.nextInt();

System.out.print("Enter your average score: ");
int score = input.nextInt();

// computation
if ( attendance >= 75 && score >= 75){
System.out.print("Hooray! You are Eligible");
} else {
System.out.print("You are not eligible");
}
}
}