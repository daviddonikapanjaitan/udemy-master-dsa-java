package C14StackAndQueueInterviewQuestion;

public class P1ThreeInOne {

    public static void main(String[] args) {
        ThreeInOne newStacks = new ThreeInOne(3);
        newStacks.push(0, 1);
        newStacks.push(0, 2);
        newStacks.push(1, 4);
        newStacks.push(1, 5);
        newStacks.push(2, 8);
        int result = newStacks.pop(2);
        System.out.println(result);
        int result1 = newStacks.peek(2);
        System.out.println(result1);
    }
}
