package dsa;

public class Node {
    Object data;
    Node next;

    public Node() {
    }

    @Override
    public String toString() {
        return String.valueOf(data) +"," + String.valueOf(this.next) ;
    }

    public String tooString() {
        return "[ Data: " + String.valueOf(data) +  " | Next: " + String.valueOf(this.next) + "]";
    }

}

