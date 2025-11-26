import java.util.Scanner;

public class CardValidatorApp  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Card Number: ");
        String cardNumber = input.nextLine();
        String cardType = CardValidatorFunction.getCardType(cardNumber);
        int lengthOfCardNumber = CardValidatorFunction.getCardNumberLength(cardNumber);
        int sumDoubledNumber = CardValidatorFunction.sumDoubledNumber(cardNumber);
        int sumOfAllOdd = CardValidatorFunction.addAllOddnumbers(cardNumber);
        int totalSum = CardValidatorFunction.totalSum(sumDoubledNumber, sumOfAllOdd);
        String status = CardValidatorFunction.checkCardValidity(totalSum);

        CardValidatorFunction.printCardInfo(cardType, cardNumber, lengthOfCardNumber, status);
    }
}