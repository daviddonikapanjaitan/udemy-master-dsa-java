package C13Queue;

public class P1Queue {

    public static void main(String[] args) {
        QueueArray newQueue = new QueueArray(3);
        newQueue.endQueue(1);
        newQueue.endQueue(2);
        newQueue.endQueue(3);
        newQueue.deleteQueue();
    }
}
