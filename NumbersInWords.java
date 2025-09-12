/*
Pseudo Code
* Prompt the user to enter 3 inputs and store the input in variables (a, b, c)

*/

import java.util.Scanner;

public class NumbersInWords{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter a number (0 - 9): ");
int Num = input.nextInt();

// Computation
if (Num == 0){ System.out.println("The entered number is Zero");}
else if(Num == 1){ System.out.println("The entered number is One");}
else if(Num == 2){ System.out.println("The entered number is Two");}
else if(Num == 3){ System.out.println("The entered number is Three");}
else if(Num == 4){ System.out.println("The entered number is Four");}
else if(Num == 5){ System.out.println("The entered number is Five");}
else if(Num == 6){ System.out.println("The entered number is Six");}
else if(Num == 7){ System.out.println("The entered number is Seven");}
else if(Num == 8){ System.out.println("The entered number is Eight");}
else if(Num == 9){ System.out.println("The entered number is Nine");}
else {System.out.print("Invalid number");}

}
}