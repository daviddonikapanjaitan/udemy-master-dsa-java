package C13Queue;

public class P2CircularQueue {

    public static void main(String[] args) {
        CircularQueue newCQ = new CircularQueue(3);

        // boolean result = newCQ.isFull();
        // System.out.println(result);

//        newCQ.enQueue(10);
//        newCQ.enQueue(20);
//        newCQ.enQueue(30);
//        int result = newCQ.deQueue();
//        System.out.println(result);
//        int result1 = newCQ.deQueue();
//        System.out.println(result1);

//        newCQ.enQueue(10);
//        newCQ.enQueue(20);
//        newCQ.enQueue(30);
//        int result = newCQ.peek();
//        System.out.println(result);
//        int result1 = newCQ.peek();
//        System.out.println(result1);

        newCQ.enQueue(10);
        newCQ.enQueue(20);
        newCQ.enQueue(30);
        newCQ.deleteQueue();
    }
}
