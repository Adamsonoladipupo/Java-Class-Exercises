package entities;

public class Modul026 {
    private int value;

    public Modul026(int value){
        this.value = value;
    }

    public int mod26(){
        if (this.value < 0){
            return this.value + 26;
        }
        else if (this.value >= 26){
            return this.value - 26;
        }
        return this.value;
    }
}
