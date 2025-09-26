import java.util.Scanner;
import java.security.SecureRandom;

public class ScissorRockPaper{
public static void main(String[] args){
System.out.println("Welcome! This is a Scissor-Rock-Paper game. Engoy! \nPLEASE NOTE: 0, 1, and 2 represent Scissor, Rock and Paper respectively.");

Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = input.nextInt();

SecureRandom randomNumber = new SecureRandom();
int scissorRockPaper = randomNumber.nextInt(3);
System.out.printf("Computer Guess: %d %n", scissorRockPaper);

if (number == scissorRockPaper){
System.out.print("You draw");
} else if (number == 1 && scissorRockPaper == 0){
System.out.print("Hooray! You win");
} else if (number == 0 && scissorRockPaper == 1){
System.out.print("Sorry! You lose");
} else if (number == 0 && scissorRockPaper == 2){
System.out.print("Hooray! You win");
} else if (number == 2 && scissorRockPaper == 0){
System.out.print("Sorry! You lose");
} else if (number == 2 && scissorRockPaper == 1){
System.out.print("Hooray! You win");
} else if (number == 1 && scissorRockPaper == 2){
System.out.print("Sorry! You lose");
}



}
}
