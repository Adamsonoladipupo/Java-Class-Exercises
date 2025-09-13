/*
Pseudo code
- display a welcome message highlighting what the app is for
- ask the user to enter an inputs
- store the entered value in a variable
- check if the entered values is less than equals to 100, print "LOW", if not
- check if the entered values is greater than 100 and less than equals to 1000, print "MEDIUM", if not
- print "High"

- print "you are not eligible"
*/

import java.util.Scanner;

public class AccountBalance{
public static void main (String[] args){
System.out.println("Welcome! This app helps you know the level of you account balance");

Scanner input = new Scanner(System.in);
System.out.print("Enter your account balance: ");
int balance = input.nextInt();

// Computation
if (balance <= 100){System.out.print("Your account balance is LOW");}
else if (balance > 100 && balance <= 1000){System.out.print("Your account balance is MEDIUM");}
else if (balance > 1000){System.out.print("Your account balance is HIGH");}
}
}
