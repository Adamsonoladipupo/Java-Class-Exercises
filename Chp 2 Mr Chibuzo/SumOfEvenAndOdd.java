import java.util.Scanner;

public class SumOfEvenAndOdd{
public static void main(String[] args){
Scanner Input = new Scanner(System.in);
System.out.println("Welcome! This application sum up the odd and even numbers in a number set");
System.out.println("Enter 10 set of number");

// Declaring variables
int Num1 = 0;
int Num2 = 0;
int Num3 = 0;
int Num4 = 0;
int Num5 = 0;
int Num6 = 0;
int Num7 = 0;
int Num8 = 0;
int Num9 = 0;
int Num10 = 0;

System.out.print("Enter number 1: ");
Num1 = Input.nextInt();
System.out.print("Enter number 2: ");
Num2 = Input.nextInt();
System.out.print("Enter number 3: ");
Num3 = Input.nextInt();
System.out.print("Enter number 4: ");
Num4 = Input.nextInt();
System.out.print("Enter number 5: ");
Num5 = Input.nextInt();
System.out.print("Enter number 6: ");
Num6 = Input.nextInt();
System.out.print("Enter number 7: ");
Num7 = Input.nextInt();
System.out.print("Enter number 8: ");
Num8 = Input.nextInt();
System.out.print("Enter number 9: ");
Num9 = Input.nextInt();
System.out.print("Enter number 10: ");
Num10 = Input.nextInt();
System.out.printf("Inputed number set: %d, %d, %d, %d, %d, %d, %d, %d, %d, %d%n", Num1, Num2, Num3, Num4, Num5, Num6, Num7, Num8, Num9, Num10);

// Computation
int EvenNumbers = 0;
if (Num1 % 2 == 0){ EvenNumbers = EvenNumbers + Num1;}
if (Num2 % 2 == 0){ EvenNumbers = EvenNumbers + Num2;}
if (Num3 % 2 == 0){ EvenNumbers = EvenNumbers + Num3;}
if (Num4 % 2 == 0){ EvenNumbers = EvenNumbers + Num4;}
if (Num5 % 2 == 0){ EvenNumbers = EvenNumbers + Num5;}
if (Num6 % 2 == 0){ EvenNumbers = EvenNumbers + Num6;}
if (Num7 % 2 == 0){ EvenNumbers = EvenNumbers + Num7;}
if (Num8 % 2 == 0){ EvenNumbers = EvenNumbers + Num8;}
if (Num9 % 2 == 0){ EvenNumbers = EvenNumbers + Num9;}
if (Num10 % 2 == 0){ EvenNumbers = EvenNumbers + Num10;}

int OddNumbers = 0;
if (Num1 % 2 != 0){OddNumbers = OddNumbers + Num1;}
if (Num2 % 2 != 0){OddNumbers = OddNumbers + Num2;}
if (Num3 % 2 != 0){OddNumbers = OddNumbers + Num3;}
if (Num4 % 2 != 0){OddNumbers = OddNumbers + Num4;}
if (Num5 % 2 != 0){OddNumbers = OddNumbers + Num5;}
if (Num6 % 2 != 0){OddNumbers = OddNumbers + Num6;}
if (Num7 % 2 != 0){OddNumbers = OddNumbers + Num7;}
if (Num8 % 2 != 0){OddNumbers = OddNumbers + Num8;}
if (Num9 % 2 != 0){OddNumbers = OddNumbers + Num9;}
if (Num10 % 2 != 0){OddNumbers = OddNumbers + Num10;}

System.out.printf("Sum of all even number: %d%n", EvenNumbers);
System.out.printf("Sum of all odd number: %d%n", OddNumbers);

}
}