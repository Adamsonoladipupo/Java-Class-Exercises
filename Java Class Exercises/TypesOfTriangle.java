/*
Pseudo Code
* Prompt the user to enter 3 inputs and store the input in variables (a, b, c)
* Check if (a) is equals to (b) and a is equals to c and b equals to c . Then display "Equilateral", if not
* Check if a is equals to b or a equals to c or c equals to b. Then display Isosceles, if not
* display scalene
*/

import java.util.Scanner;

public class TypesOfTriangle{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.println("Welcome! Enter three numbers to get the type of triangle");\
System.out.print("Enter first number: ");
int a = input.nextInt();

System.out.print("Enter second number: ");
int b = input.nextInt();

System.out.print("Enter three number: ");
int c = input.nextInt();

// computation
if (a==b && a==c && b==c){
System.out.print("Equilateral");
}
else if (a==b || a==c || b==c){
System.out.print("Isoceles");
}
else {
System.out.print("Scalene");
}

}
}