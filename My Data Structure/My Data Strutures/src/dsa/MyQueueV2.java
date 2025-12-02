package dsa;

import java.util.NoSuchElementException;

public class MyQueueV2 {
    private int count = 0;
    private Object[] queueList = new Object[5];

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean add(Object element) {
        if ( queueList.length == 0){
            throw new IllegalStateException ("no space currently available");
        }
        else {
            for (int check = 0; check < queueList.length; check++){
                if (queueList[check] == null){
                    queueList[check] = element;
                    count++;
                }
            }
            return true;
        }
    }

    public Object remove() {
//        if(queueList.length == count){
//            throw new NoSuchElementException("this queue is empty");
//        }
        Object removedObject = null;
        for (int check = 0; check < queueList.length; check++){
            if (queueList[check] != null){
                removedObject = queueList[check];
                queueList[0] = null;
                count--;
            }
        }
        return removedObject;
    }

    public Object poll(){
        if (count <= 0){
            return null;
        }
        else {
            Object removedObject = queueList[0];
            queueList[0] = null;
            count--;
            return removedObject;
        }
    }

    public Object peek() {
        if (count <= 0){
            return null;
        }
        else {
            return queueList[0];
        }
    }
}
