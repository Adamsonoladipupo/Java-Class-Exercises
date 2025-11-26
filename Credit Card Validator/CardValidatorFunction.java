public class CardValidatorFunction {
    public static String getCardType(String cardNumber){
        String cardType = "";
        if(cardNumber.charAt(0) == '4' && cardNumber.length() >= 13 && cardNumber.length() <= 16){
            cardType = "Visa Card";
        }
        else if(cardNumber.charAt(0) == '5' && cardNumber.length() >= 13 && cardNumber.length() <= 16){
            cardType = "MasterCard";
        }
        else if(cardNumber.charAt(0) == '6' && cardNumber.length() >= 13 && cardNumber.length() <= 16){
            cardType = "Discover Card";
        }
        else if(cardNumber.charAt(0) == '3' && cardNumber.charAt(1) == '7' && cardNumber.length() >= 13 && cardNumber.length() <= 16){
            cardType = "American Express Card";
        }
        else{
            cardType = "Invalid card ";
        }
        return cardType;
    }

    public static int getCardNumberLength(String input){
        int lengthOfCardNumber = input.length();
        return lengthOfCardNumber;
    }

    public static int addAllOddnumbers(String cardNumber){
        int sumOfAllOdd = 0;
        for (int count = cardNumber.length()-1; count > 0; count-=2){
            int oddNumbers = cardNumber.charAt(count);
            sumOfAllOdd += oddNumbers - '0';
        }
        return sumOfAllOdd;
    }

    public static int sumDoubledNumber(String cardNumber){
        int doubledNumber = 0; int sumDoubledNumber = 0;
        for (int count = cardNumber.length()-2; count > -1; count-=2){
            doubledNumber = cardNumber.charAt(count);
            doubledNumber = (doubledNumber - '0') * 2;
            if (doubledNumber > 9){
                doubledNumber = doubledNumber -9;
            }
            sumDoubledNumber += doubledNumber ;
        }
        return sumDoubledNumber;
    }

    public static int totalSum(int sumDoubledNumber, int sumOfAllOdd){
        int totalSum = sumOfAllOdd + sumDoubledNumber;
        return totalSum;
    }

    public static String checkCardValidity(int totalSum){
        String status = "";
        if (totalSum % 10 == 0){
            status = "Card is invalid";
        }
        else{
            status = "Card is invalid";
        }
        return status;
    }

    public static void printCardInfo(String cardType, String CardNumber, int lengthOfCardNumber, String status){
        String cardInfo = """
        +++++++++++++++++++++++++++++++++++++++++++++++
        ++ Credit card type: %s
        ++ Credit card number: %s
        ++ Credit card digit length: %d
        ++ Validity status: %s
        +++++++++++++++++++++++++++++++++++++++++++++++
        """;
        System.out.printf(cardInfo, cardType, CardNumber, lengthOfCardNumber, status);
    }
}
