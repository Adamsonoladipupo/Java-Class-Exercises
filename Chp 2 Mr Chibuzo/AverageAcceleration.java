import java.util.Scanner;

public class AverageAcceleration{
public static void main(String[] args) {

// create a new scanner to collect user's input
Scanner input = new Scanner(System.in);


System.out.print("Input the initial Velocity:"); // prompt users to enter initial velocity
double v0 = input.nextInt();

System.out.print("Input the final Velocity:"); // prompt users to enter final velocity
double v1 = input.nextInt();

System.out.print("Input time:"); // prompt users to enter time velocity
double t = input.nextInt();

// calculating the change in velocity
int vd = v1 - v0;

// calculating the average acceleration
int a = vd / t ; 

System.out.printf("The average acceleration a is %d%n", a);
}
}javac