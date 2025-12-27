package entities;

public class ToInteger {
    private char value;

    public ToInteger(char value){
        this.value = value;
    }
    public int getInt(){
        char a = 'a'; char z = 'z'; char space = ' ';
        if (this.value > z || this.value < a ){
            throw new IllegalArgumentException("invalid input");
        }
        else if (this.value == space){
            return space;
        }
        else{
            return value - 'a';
        }
    }


}
