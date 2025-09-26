import java.util.Scanner;

public class NegativePositiveAndZeroValues{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.println("ENTER FIVE INTEGERS");

System.out.print("Enter 1st integer:");
int Num1 = input.nextInt();
System.out.print("Enter 2nd integer:");
int Num2 = input.nextInt();
System.out.print("Enter 3rd integer:");
int Num3 = input.nextInt();
System.out.print("Enter 4th integer:");
int Num4 = input.nextInt();
System.out.print("Enter 5th integer:");
int Num5 = input.nextInt();

/* if Num 1 > 0 then its a positive number, 
Num 1 < 0 then its a negative number, Num 1 = 0 then it's zero,*/

//variables to store Negative, positive, and Zero
int Negative = 0;
int Positive = 0;
int Zero = 0;

// If statements
// for numbers < 0, negative numbers
if (Num1 < 0){Negative = Negative +1;}
if (Num2 < 0){Negative = Negative +1;}
if (Num3 < 0){Negative = Negative +1;}
if (Num4 < 0){Negative = Negative +1;}
if (Num5 < 0){Negative = Negative +1;}

// for numbers > 0, positive number
if (Num1 > 0){Positive = Positive +1;}
if (Num2 > 0){Positive = Positive +1;}
if (Num3 > 0){Positive = Positive +1;}
if (Num4 > 0){Positive = Positive +1;}
if (Num5 > 0){Positive = Positive +1;}

// for numbers = 0, positive number
if (Num1 == 0){Zero = Zero +1;}
if (Num2 == 0){Zero = Zero +1;}
if (Num3 == 0){Zero = Zero +1;}
if (Num4 == 0){Zero = Zero +1;}
if (Num5 == 0){Zero = Zero +1;}

// Output
System.out.printf("Number of positive numbers are: %d%n", Positive);
System.out.printf("Number of negative numbers are: %d%n", Negative);
System.out.printf("Number of zero numbers are: %d%n", Zero);

}
}