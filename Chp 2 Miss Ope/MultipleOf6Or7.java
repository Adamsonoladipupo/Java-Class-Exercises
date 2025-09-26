import java.util.Scanner;

public class MultipleOf6Or7{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
int Num1 = input.nextInt();

// computation
if (Num1 % 6 == 0){ System.out.printf("%d%n is a multiple of 6", Num1);}
if (Num1 % 7 == 0){ System.out.printf("%d%n is a multiple of 7", Num1);}

if (Num1 % 6 != 0 && Num1 % 7 != 0 ){ System.out.printf("Neither is %d a multiple of 6 nor 7", Num1);}
}
}