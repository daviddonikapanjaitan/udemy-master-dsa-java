package C23Hashing;

public class P4LinearProbingSearchDelete {

    public static void main(String[] args) {
        LinearProbing lp = new LinearProbing(13);
        lp.insertInHashTable("The");
        lp.insertInHashTable("quick");
        lp.insertInHashTable("brown");
        lp.insertInHashTable("fox");
        lp.insertInHashTable("over");
        lp.deleteKeyHashTable("fox");
        lp.displayHashTable();
    }
}
