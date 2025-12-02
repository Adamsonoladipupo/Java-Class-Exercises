package dsa;

public class Admin {
    private String name;
    private static String pin;

    Admin (){
        this.name = "Madam Eniife";
        this.pin = "1234";
    }

    public static String getPin(){
        return pin;
    }




}
