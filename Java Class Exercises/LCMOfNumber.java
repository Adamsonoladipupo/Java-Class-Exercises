/*
Pseudocode
- display a message informing the user what the app is use for
- ask the user for input
- store the entered value in a variable
- start dividing the entered value from 2 upword (2, 3, 4, 5 ....) only using the values that won't give a remainder until the value is divided to 1
- sum up all the numbers that's able to divide without remainder
- store the sum in a variable
- print the sum variable
*/
import java.util.Scanner;

public class LCMOfNumber{
public static void main(String[] args){

System.out.println("Welcome! This app helps you calculate the L.C.M of a number.");

Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = input.nextInt();

int divisor = 2;
int sumOfDivisors = 0;

while ( number != 1){
if (number % divisor == 0 ){
number = number/divisor;
sumOfDivisors += divisor;
} else {
divisor++;
}
}

System.out.printf("The LCM is: %d",sumOfDivisors);
}
}