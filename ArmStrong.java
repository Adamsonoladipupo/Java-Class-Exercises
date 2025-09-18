import java.util.Scanner;

public class ArmStrong{
public static void main(String[] args){
int initialInput = 0;
Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = input.nextInt();
initialInput = number;
int seperatedNumber = 0;
int cubeOfSeperatedNumber = 0;
int SumOfCubeOfSeperatedNumber = 0;

while(number % 10 !=0 || number / 10 !=0){
seperatedNumber = number % 10;
cubeOfSeperatedNumber = seperatedNumber*seperatedNumber*seperatedNumber;
System.out.println(cubeOfSeperatedNumber);
SumOfCubeOfSeperatedNumber += cubeOfSeperatedNumber;
number /=10;
seperatedNumber = 0;
}
if (initialInput == SumOfCubeOfSeperatedNumber){
System.out.printf("%d is a strong number", initialInput);
} else {
System.out.printf("%d is not a strong number", initialInput);
}
}
}
