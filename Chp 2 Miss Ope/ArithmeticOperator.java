import java.util.Scanner;

public class ArithmeticOperator{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.print("Enter your first number :");
double Num1 = input.nextDouble();

System.out.print("Enter prefered operator (+ - / *): ");
char Operator = input.next().charAt(0);

System.out.print("Enter your second number :");
double Num2 = input.nextDouble();

double Result = 0 ;
if (Operator == '+'){ 
Result = Num1 + Num2;
}
if (Operator == '-'){ 
Result = Num1 - Num2;
}
if (Operator == '/'){ 
Result = Num1 / Num2;
}
if (Operator == '*'){ 
Result = Num1 * Num2;
}

System.out.printf("The result of is: %f", Result);

}
}