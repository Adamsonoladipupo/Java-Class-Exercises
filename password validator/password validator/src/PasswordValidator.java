import exceptions.PasswordException;

public class PasswordValidator {
    public static String validatePassword(String userInput){
        char[] specialCharacter = {'!','@','#','$','%','^','&','*','(',')','{','}','[',']',';',':','"','<','>',',','.','?','/','|','=','+','-','_'};
        char[] numbers = {'0','1','2','3','4','5','6','7','8','9'};
        boolean isBlank = true;
        boolean containsSpecialCharacter = false;
        boolean containsNumber = false;
        boolean isEightCharLong = false;
        int passwordLength = 0;
        if(userInput.equals("")) {
            isBlank = true;
            throw new PasswordException("sorry, password cannot be blank");
        }

        for (int check = 0; check < userInput.length(); check++){
            passwordLength++;
            char letter = userInput.charAt(check);
            for (int loopChar = 0; loopChar < specialCharacter.length; loopChar++){
                if(specialCharacter[loopChar] == letter) {
                    containsSpecialCharacter = true;
                    break;
                }
            }
            for (int loopNumber = 0; loopNumber < numbers.length; loopNumber++){
                if (numbers[loopNumber] == letter){
                    containsNumber = true;
                    break;
                }
            }

        }
        if (!containsSpecialCharacter) throw new PasswordException("sorry, password must contain a special character");
        if (!containsNumber) throw new PasswordException("Sorry, password must contain number");
        if (passwordLength < 8) throw new PasswordException("sorry, password must be more than eight characters");
        return "correct, all requirement met";
    }
    public static void main(String[] args){
        String myPassword = "ABCD";
        System.out.println(validatePassword(myPassword));
    }
}
