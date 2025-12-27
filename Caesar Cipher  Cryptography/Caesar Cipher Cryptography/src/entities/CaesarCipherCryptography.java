package entities;

public class CaesarCipherCryptography {
    //private char input;

    public void encrypt(char input, int key){
        ToInteger toInteger = new ToInteger(input);
        int newInt = toInteger.getInt();
        System.out.print(newInt);
        int addKey = newInt + key;
        System.out.print(addKey);
        Modul026 modul026 = new Modul026(addKey);
        int modulo = modul026.mod26();
        System.out.print(modulo);
        ToString toString = new ToString(modulo);
        char encrypted = toString.getChar();
        System.out.print(encrypted);
        //return encrpted;

    }
}
