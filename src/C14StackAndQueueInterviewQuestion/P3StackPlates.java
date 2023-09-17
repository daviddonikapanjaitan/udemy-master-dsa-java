package C14StackAndQueueInterviewQuestion;

public class P3StackPlates {

    public static void main(String[] args) {
//        Stack newStack = new Stack(3);
//        newStack.push(1);
//        newStack.push(2);
//        System.out.println(newStack.pop());

//        SetOfStacks newStack = new SetOfStacks(3);
//        newStack.push(1);
//        newStack.push(2);
//        newStack.push(3);
//        newStack.push(4);
//        newStack.push(5);
//        System.out.println(newStack.pop());

        SetOfStacks newStack = new SetOfStacks(3);
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);
        newStack.push(5);
        System.out.println(newStack.popAt(0));
        System.out.println(newStack.popAt(0));
        System.out.println(newStack.popAt(0));
    }
}
