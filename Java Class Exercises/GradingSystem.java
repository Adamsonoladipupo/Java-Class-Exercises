/*
Pseudo Code
* Prompt the user to enter 3 inputs and store the input in variables (a, b, c)
* 
*/

import java.util.Scanner;

public class GradingSystem{'
public static void main(String[] args){

System.out.print("Welcome! This program helps you grade your scores");
Scanner input = new Scanner(System.in);

System.out.print("Enter your overal score: ");
int Score = input.nextInt();

// Computation
if (Score >= 90){System.out.print("Your grade is A");}
else if (Score <= 89 && Score >80){System.out.print("Your grade is B");}
else if (Score <= 79 && Score >70){System.out.print("Your grade is C");}
else if (Score <= 69 && Score >60){System.out.print("Your grade is D");}
else {System.out.print("Your Grade is F");}
}
}