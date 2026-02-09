package dsa;

public class MyArrayList {
    private int count = 0;
    private int initialLength = 10;
    private Object[] myArrayList = new Object[initialLength];


    public boolean isEmpty() {
        return count ==0;
    }

    public boolean add(Object input) {
        if (isFull()) {
            expandArrayLenght();
        }
        myArrayList[count] = input;
        count++;
        return true;
    }

    public void add(int index, Object input){
        if (isFull() || index > count) {
            expandArrayLenght();
        }
        myArrayList[index] = input;
        count++;
    }

    public boolean isFull(){
        return count == initialLength;
    }

    public void expandArrayLenght(){
            Object[] newArrayList = new Object[initialLength*initialLength];
            for (int copy = 0; copy < this.count; copy++){
                newArrayList[copy] = myArrayList[copy];
            }
            myArrayList = newArrayList ;
    }

    public boolean remove(Object input) {
        if (!isContained(input)) return false;
        int inputIndex = -1;
        for (int check = 0; check < myArrayList.length; check++){
            inputIndex++;
            if (myArrayList[check].equals(input)){
                myArrayList[check] = null;
                break;
            }
        }
        for (int move = inputIndex; move < myArrayList.length; move++){
            myArrayList[move++] = myArrayList[move];
        }
        count--;
        return true;
    }

    public boolean isContained(Object input){
        for (Object object : myArrayList){
            if (object == input) return true;
        }
        return false;
    }

    public void clear() {
        count = 0;
    }

    public int size() {
        return count;
    }
}
