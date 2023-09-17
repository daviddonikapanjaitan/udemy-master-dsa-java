package C12Stack;

public class P1Stack {

    int[] arr;
    int topOfStack;

    public P1Stack(int size) {
        this.arr = new int[size];
        this.topOfStack = - 1;
        System.out.println("The Stack is created with size of: " + size);
    }

    // isEmpty
    public boolean isEmpty() {
        if(topOfStack == -1){
            return true;
        } else {
            return false;
        }
    }

    // isFull
    public boolean isFull(){
        if(topOfStack == arr.length - 1){
            System.out.println("The stack is full");
            return true;
        }  else {
            return false;
        }
    }

    // Push
    public void push(int value) {
        if(isFull()){
            System.out.println("The Stack is full!!");
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("The value is successfully inserted");
         }
    }

    // pop
    public int pop () {
        if(isEmpty()){
            System.out.println("The stack is empty");
            return - 1;
        } else {
            int topStack = arr[topOfStack];
            topOfStack--;
            return topStack;
        }
    }

    // Peek method
    public int peek(){
        if(isEmpty()){
            System.out.println("The stack is empty!");
            return -1;
        } else {
            return arr[topOfStack];
        }
    }

    // delete method
    public void deleteStack() {
        arr = null;
        System.out.println("The Stack is successfully deleted");
    }

    public static void main(String[] args) {
        P1Stack newStack = new P1Stack(4);
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);

        newStack.deleteStack();

//        int result = newStack.peek();
//        System.out.println(result);
//        int result1 = newStack.peek();
//        System.out.println(result1);

//        int result = newStack.pop();
//        System.out.println(result);
//        int result1 = newStack.pop();
//        System.out.println(result1);

//        boolean result = newStack.isFull();
//        System.out.println(result);
    }
}
