import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Enter a number: ");
        int num2 = input.nextInt();
        System.out.print("Enter a number: ");
        int num3 = input.nextInt();
        System.out.print("Enter a number: ");
        int num4 = input.nextInt();
        System.out.print("Enter a number: ");
        int num5 = input.nextInt();

        System.out.print(num1 + " ");
        for (int count = 0; count < num1;count++){
            System.out.print('*');
        }System.out.println();
        System.out.print(num2 + " ");
        for (int count = 0; count < num2;count++){
            System.out.print('*');
        }System.out.println();
        System.out.print(num3 + " ");
        for (int count = 0; count < num3;count++){
            System.out.print('*');
        }System.out.println();
        System.out.print(num4 + " ");
        for (int count = 0; count < num4;count++){
            System.out.print('*');
        }System.out.println();
        System.out.print(num5 + " ");
        for (int count = 0; count < num5;count++){
            System.out.print('*');
        }System.out.println();
    }
}