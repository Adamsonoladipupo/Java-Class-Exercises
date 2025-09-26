import java.util.Scanner;

public class MultiplesOfTwoNumbers {
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.print("Enter your first number:");
int Number1 = input.nextInt();
int Number1Tripple = Number1 * Number1 * Number1;
System.out.printf("First number trippled :%d%n", Number1Tripple);

System.out.print("Enter your second number:");
int Number2 = input.nextInt();
int Number2Double = Number2 * Number2;
System.out.printf("Second number doubled :%d%n", Number2Double);

if (Number1Tripple % Number2Double == 0){
System.out.printf("The first number is a multiple of the second ");
}

if (Number1Tripple % Number2Double != 0){
System.out.printf("The first number is not a multiple of the second ");
}
}
}