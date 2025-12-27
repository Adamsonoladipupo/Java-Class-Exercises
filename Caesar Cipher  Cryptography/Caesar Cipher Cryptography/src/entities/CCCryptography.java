package entities;

public class CCCryptography {

    public int charToInt( char input){
        if (input >= 'a' && input <= 'z' )return input - 'a';
        if (input >= 'A' && input <= 'Z' )return input - 'A';
        else if(input == ' ') return ' ';
        else throw new IllegalArgumentException("The value you enter is outside the range");

    }

    public int addKey(int input, int key){
        if (input == ' ') return ' ';
        else return input + key;
    }

    public int minuseKey(int input, int key){
        if (input == ' ') return ' ';
        else return input - key;

    }


    public int modulo26(int input){
        if (input < 0) return input + 26;
        else if (input == 32) return ' ';
        else if (input >= 26) return input - 26;
        return input;
    }

    public char intToChar(int input){
        if(input == ' ') return ' ';
        else return (char)(input+97);
    }

    public char encrypt(char input, int key){
        int integer = charToInt(input);
        int newAddKey = addKey(integer, key);
        int modulo = modulo26(newAddKey);
        return intToChar(modulo);
    }

    public String encrypt(String input, int key){
        String encrypted = "";
        for (int encrypting = 0; encrypting < input.length(); encrypting++){
            char letter = input.charAt(encrypting);
            int integer = charToInt(letter);
            int newAddKey = addKey(integer, key);
            int modulo = modulo26(newAddKey);
            char newLetter = intToChar(modulo);
            encrypted += newLetter;
        }
        return encrypted;
    }

    public char decrypt(char input, int key){
        int integer = charToInt(input);
        int newMinusKey = minuseKey(integer, key);
        int modulo = modulo26(newMinusKey);
        return intToChar(modulo);
    }

    public String decrypt(String input, int key){
        String decrypted = "";
        for (int decrypting = 0; decrypting < input.length(); decrypting++){
            char letter = input.charAt(decrypting);
            int integer = charToInt(letter);
            int newMinusKey = minuseKey(integer, key);
            int modulo = modulo26(newMinusKey);
            char newLetter = intToChar(modulo);
            decrypted += newLetter;
        }
        return decrypted;
    }
}
