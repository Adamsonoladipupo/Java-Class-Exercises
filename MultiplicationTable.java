/*
Pseudocode
- display a message highlighting the use of the app
- ask the user to enter a number
- store the number in a variable
- continously multiply the store number by 1 up to 12 (1x1, 1x2, 1x3 ..... 1x12)
- display the result of each of the multiplication

*/
import java.util.Scanner;

public class MultiplicationTable{
public static void main(String [] args){
System.out.println("Welcome! This app helps you print out the multiplication table of a number from 1-12");

System.out.print("Enter number: ");
Scanner input = new Scanner(System.in);
int number = input.nextInt();

int multiNumber = 0;
int result = 0;
int counter = 0;
while (counter < 12){
multiNumber +=1;
result = number * multiNumber;
counter ++;
System.out.printf("%d x %d = %d %n", number, multiNumber, result);
}

}
}