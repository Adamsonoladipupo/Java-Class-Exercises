/*
Pseudo Code:
- Collect an input from the user 
- Save the entered number in a variable
- add the entered number by itself the number of times of the number (if 3 is entered, 3 is added by itself three times)
- 
- print the square of the variable
*/  

import java.util.Scanner;
public class SquareOfNumber{
public static void main(String[] args){
System.out.println("Welcome! This program helps you calculate the square of number");

Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = input.nextInt();
int sqaureOfNumber = 0;

// Computation
for (int number = 1, number<=10, number ++){

}


System.out.printf("The square of %d is %d", number, sqaureOfNumber);

}
}