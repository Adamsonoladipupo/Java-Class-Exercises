import java.util.Scanner;

public class ReverseNumber{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int number = input.nextInt();
int seperatedNumber = 0;

/* for (int i = 0; i <= number; i++){
seperatedNumber = number % 10;
number /=10;
System.out.printf("iteration %d %n", i);
System.out.printf("seperated digit %d %n", seperatedNumber);
} */

while(number % 10 !=0 || number / 10 !=0){
seperatedNumber = number % 10;
System.out.print(seperatedNumber);
number /=10;
}


}
}
