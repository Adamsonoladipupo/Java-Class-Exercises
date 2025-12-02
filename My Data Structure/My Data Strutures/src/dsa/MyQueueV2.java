package dsa;

public class MyQueueV2 {
    private int count = 0;
    private Object[] queueItems = new Object[3];

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean add(Object element) {
        if ( count >= queueItems.length ){
            throw new IllegalStateException ("no space currently available");
        }
        else {
            queueItems[count] = element;
            count++;
            return true;
        }
    }

    public Object remove() {
        Object removedObject = queueItems[0];
        queueItems[0] = null;
        count--;
        return removedObject;
    }

    public Object poll(){
        if (count <= 0){
            return null;
        }
        else {
            Object removedObject = queueItems[0];
            queueItems[0] = null;
            count--;
            return removedObject;
        }
    }

    public Object peek() {
        if (count <= 0){
            return null;
        }
        else {
            return queueItems[0];
        }
    }
}
