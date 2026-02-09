package dsa;

public class MyLinkedList {
    private Node head;
    private int count;

    public MyLinkedList() {
        this.head = null;
        this.count = 0;
    }

    @Override
    public String toString() {
        return String.valueOf(head);
    }

    public int size() {
        return count;
    }

    public Node print() {
        return head;
    }

    public boolean add(Object element) {
        Node newNode = new Node();
        newNode.data = element;
        newNode.next = null;

        if (head == null) head = newNode;
        else {
            Node oldNode = head;
            while (oldNode.next != null) {
                oldNode = oldNode.next;
            }
            oldNode.next = newNode;
        }
        count++;
        return true;
    }


    public void add(int index, Object element) {
        int indexCounter = -1;
        Node temp = null;
        Node insertNode = new Node();
        insertNode.data = element;
        insertNode.next = null;

        Node oldNode = new Node();
        oldNode = head;
        indexCounter++;
        while (oldNode != null) {
            oldNode = oldNode.next;
            oldNode.next = temp;
            indexCounter++;
            System.out.println(oldNode);
            if (indexCounter == index) {
                oldNode.next = insertNode;
                System.out.println("Matched");
                oldNode = insertNode.next;
            }
            temp = insertNode.next;
        }
    }


    public void addFirst(Object element) {
        Node insertNode = new Node();
        insertNode.data = element;
        insertNode.next = head;
        count++;
        head = insertNode;
    }

    public void addLast(Object element) {
        Node insertNode = new Node();
        insertNode.data = element;

        if (head != null) {
            Node newNode = new Node();
            newNode = head;
            while (newNode.next != null) {
                newNode = newNode.next;
            }
            newNode.next = insertNode;
            count++;
        }
    }

    public void clear() {
        head = null;
        count = 0;
    }

    public boolean contains(Object element) {
        if (head == null) return false;
        else {
            Node checker = head;
            if (head.data == element) return true;
            while (checker.next != null) {
                checker = checker.next;
                if (checker.data == element) return true;
            }
        }
        return false;
    }

    public Object element() {
        return head.data;
    }

    public Object get(int index) {
        int indexChecker = 0;
        if(head == null) return null;
        if (index == 0) return head.data;
        else {
            Node getter = head;
            if (head.data != null)
            while (getter.next != null) {
                indexChecker++;
                getter = getter.next;
                if (index == indexChecker) return getter.data;
            }
        }
        return null;
    }
}
