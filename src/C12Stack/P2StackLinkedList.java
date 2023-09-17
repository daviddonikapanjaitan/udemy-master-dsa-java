package C12Stack;

public class P2StackLinkedList {
    LinkedList linkedList;

    public P2StackLinkedList(){
        linkedList = new LinkedList();
    }

    // Push method
    public void push(int value) {
        linkedList.insertInLinkedList(value, 0);
        System.out.println("Inserted " + value + " in Stack");
    }

    // isEmpty
    public boolean isEmpty(){
        if(linkedList.head == null) {
            return true;
        } else {
            return false;
        }
    }

    // Pop method
    public int pop() {
        int result = -1;
        if(isEmpty()) {
            System.out.println("The Stack is Empty!");
        } else {
            result = linkedList.head.value;
            linkedList.deletionOfNode(0);
        }
        return result;
    }

    // Peek Method
    public int peek() {
        if(isEmpty()) {
            System.out.println("The Stack is Empty!");
            return -1;
        } else {
            return linkedList.head.value;
        }
    }

    // Delete method
    public void deleteStack(){
        linkedList.head = null;
        System.out.println("The stack is deleted");
    }

    public static void main(String[] args) {
        P2StackLinkedList newStack = new P2StackLinkedList();
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);

        newStack.deleteStack();

//        int result = newStack.peek();
//        System.out.println(result);
//        int result1 = newStack.peek();
//        System.out.println(result1);

//        int result = newStack.pop();
//        System.out.println(result);
//        int result1 = newStack.pop();
//        System.out.println(result1);

//        boolean result = newStack.isEmpty();
//        System.out.println(result);
    }
}
