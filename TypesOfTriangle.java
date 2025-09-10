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