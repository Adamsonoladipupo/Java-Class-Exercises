import java.util.Scanner;

public class ParametersOfACircle{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.print("Enter the radius of the Circle:");
int radius = input.nextInt();

System.out.printf("The Diameter of the Circle is : %d%n", radius + radius);

System.out.printf("The Circumference of the Circle is : %.5f%n", 2 * 3.14159 * radius);

System.out.printf("The Area of the Circle is : %.5f%n", 3.14159 * radius * radius);

}
}