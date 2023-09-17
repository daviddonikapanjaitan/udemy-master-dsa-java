package C13Queue;

import C12Stack.LinkedList;

public class P3QueueLinkedList {

    LinkedList list;

    public P3QueueLinkedList() {
        list = new LinkedList();
        System.out.println("The Queue is successfully created");
    }

    // isEmpty
    public boolean isEmpty() {
        if(list.head == null) {
            return true;
        } else {
            return false;
        }
    }

    // enQueue
    public void enQueue(int value) {
        list.insertInLinkedList(value, list.size);
        System.out.println("Successfully inserted " + value + " in the queue.");
    }

    // deQueue
    public int deQueue() {
        int value = -1;
        if(isEmpty()){
            System.out.println("The Queue is Empty");
        } else {
            value = list.head.value;
            list.deletionOfNode(0);
        }
        return value;
    }

    // peek
    public int peek() {
        if(isEmpty()) {
            System.out.println("The Queue is Empty");
            return -1;
        } else {
            return list.head.value;
        }
    }

    // delete
    public void deleteQueue () {
        list.head = null;
        list.tail = null;
        System.out.println("The Queue is successfully deleted");
    }

    public static void main(String[] args) {
        P3QueueLinkedList newQLL = new P3QueueLinkedList();
        newQLL.enQueue(10);
        newQLL.enQueue(20);
        newQLL.enQueue(30);
//        boolean result = newQLL.isEmpty();
//        System.out.println(result);

//        int result = newQLL.deQueue();
//        System.out.println(result);
//        int result1 = newQLL.deQueue();
//        System.out.println(result1);

//        int result = newQLL.peek();
//        System.out.println(result);
//        int result1 = newQLL.peek();
//        System.out.println(result1);

        newQLL.deQueue();
    }
}
