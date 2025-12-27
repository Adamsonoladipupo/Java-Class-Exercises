package entities;

public class ToString {
    private int value;

    public ToString (int value){
        this.value = value;
    }

    public char getChar(){
        if (this.value < 97 || this.value > 122){
            throw new IllegalArgumentException("Invalid input");
        }
        else return (char) (value);
    }
}
