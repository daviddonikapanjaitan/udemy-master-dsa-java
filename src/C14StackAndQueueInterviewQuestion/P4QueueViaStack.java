package C14StackAndQueueInterviewQuestion;

public class P4QueueViaStack {

    public static void main(String[] args) {
        QueueViaStack newQueue = new QueueViaStack();
        newQueue.enqueue(1);
        newQueue.enqueue(2);
        newQueue.enqueue(3);
        System.out.println(newQueue.peek());
        newQueue.enqueue(4);
        System.out.println(newQueue.peek());
    }
}
