/*
Pseudo Code:
- Collect an input from the user
- store the entered into a variable
- check if when the variable is divided by 2 it has a zero remainder, display even number, if not
- check if when the variable is divided by 2 it has a 1 or -1 remainder, display odd number, if not
- check if when the variable is divided by 2 the rmainder is not 0 or 1 or -1, display Invalid 
*/
import java.util.Scanner;

public class EvenOddOrInvalidNumbers{
public static void main(String[] args){
System.out.println("Welcome! This app helps your know the type of numbers");

Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
double number = input.nextDouble();

// computation
if (number % 2 == 0){
System.out.printf("%.1f is an EVEN number", number);
} else if (number % 2 == 1 || number % 2 == -1){
System.out.printf("%.1f is an ODD number", number);
} else if (number % 2 != 0 && number % 2 != 1 && number % 2 != -1) {
System.out.printf("%.1f is INVALID, not an integer", number);
}

}
}