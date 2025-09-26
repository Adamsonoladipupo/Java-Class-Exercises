import java.util.Scanner;

public class SwappingValues{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter first number: ");
int a = input.nextInt();
System.out.print("Enter second number: ");
int b = input.nextInt();

// swapping computation
a=a*b;
b=a/b;
a=a/b;

System.out.println(a);
System.out.println(b);

}
}
