import java.util.Scanner;

public class StrongNumber{
public static void main(String[] args){
int initialInput= 0;
Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = input.nextInt();
initialInput = number;

// Solving for factorial of number

/* 
int factorial = 1;
for (int i=1; i<=number; i++){
	factorial = factorial * i;
	System.out.println(factorial);
}
 
System.out.printf("The factorial of %d is %d", number, factorial);
*/

// computing the logic for determing StrongNumbers
int seperatedNumber = 0;
int factorial = 1;
int sumFactorials = 0;
while (number%10!=0 || number/10!=0){
seperatedNumber = number % 10;
	for (int i=1; i<=seperatedNumber; i++){
	factorial = factorial *i;
	System.out.printf("factorial iteration %d %n", i);
	}
	System.out.printf("factorial %d is %d %n", number, factorial);
	sumFactorials += factorial ;
	factorial = 1;
	number = number /10;
	System.out.printf("seperation iteration for %d %n", number);
	
}
System.out.printf("Sum of Factorials %d %n ", sumFactorials);
if (initialInput == sumFactorials){
	System.out.printf("%d is a strong number ", initialInput);
} else {
	System.out.printf("%d is not a strong number ", initialInput);
}



}
}
