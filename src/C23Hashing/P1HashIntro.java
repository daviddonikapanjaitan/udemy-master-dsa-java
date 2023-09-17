package C23Hashing;

public class P1HashIntro {

    public static void main(String[] args) {
        DirectChanning directChanning = new DirectChanning(5);
        directChanning.insertHashTable("The");
        directChanning.insertHashTable("quick");
        directChanning.insertHashTable("brown");
        directChanning.insertHashTable("fox");
        directChanning.insertHashTable("over");
        directChanning.displayHashTable();
    }
}
