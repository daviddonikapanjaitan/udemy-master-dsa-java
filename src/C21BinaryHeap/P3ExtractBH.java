package C21BinaryHeap;

public class P3ExtractBH {

    public static void main(String[] args) {
        BinaryHeap newBP = new BinaryHeap(5);
        newBP.insert(10, "Max");
        newBP.insert(5, "Max");
        newBP.insert(15, "Max");
        newBP.insert(1, "Max");
        newBP.levelOrder();
        newBP.extractHeadOfBP("Max");
        newBP.levelOrder();
    }
}
