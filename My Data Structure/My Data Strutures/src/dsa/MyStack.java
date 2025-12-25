package dsa;

public class MyStack {
    private int count = 0;
    private int stackLength;
    private Object[] element ;

    public MyStack (int stackLength){
        this.stackLength = stackLength;
        this.element = new Object[stackLength];
    }


    public int count(){
        return count;
    }
    public boolean empty() {
        return count ==0;
    }

    public Object push(Object newElement) {
        element[count] = newElement;
        count++;
        return newElement;
    }


    public Object pop() {
        return element[--count];
    }

    public Object peek() {
        return element[--count];
    }

    public int search(Object searchedElement) {
        int index = 0;
        for (Object object: element){
            index++;
            if (object == searchedElement) {
                return index;
            }
        }
        return -1;
    }
}
