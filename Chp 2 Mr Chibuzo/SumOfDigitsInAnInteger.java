import java.util.Scanner;

public class SumOfDigitsInAnInteger{
public static void main(String[] atgs){
System.out.println("Welcome!, This application helps you sum all the digits in a number.");
Scanner input = new Scanner(System.in);
System.out.print("Enter any number between 1 - 1000: ");
int Number = input.nextInt();

int Num_1 = 0 ;
int Num_2 = 0 ;
int Num_3 = 0 ;
int Num_4 = 0 ;

if (Number != 0 ){
Num_1 = Number % 10;
Number = Number / 10;
System.out.println(Num_1);
}

if (Number != 0 ){
Num_2 = Number % 10;
Number = Number / 10;
System.out.println(Num_2);
}

if (Number != 0 ){
Num_3 = Number % 10;
Number = Number / 10;
System.out.println(Num_3);
}

if (Number != 0 ){
Num_4 = Number % 10;
Number = Number / 10;
System.out.println(Num_4);
}

if (Number <= 0 ){
int SumOfAllDigits = Num_1 + Num_2 + Num_3 + Num_4;
System.out.printf("The sum of the digits is %d", SumOfAllDigits);
}

}
}