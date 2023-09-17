package C23Hashing;

public class P5QuadraticProbing {

    public static void main(String[] args) {
        QuadraticProbing quadraticProbing = new QuadraticProbing(13);
        quadraticProbing.insertKeyInHashTable("The");
        quadraticProbing.insertKeyInHashTable("quick");
        quadraticProbing.insertKeyInHashTable("brown");
        quadraticProbing.insertKeyInHashTable("fox");
        quadraticProbing.insertKeyInHashTable("over");
        quadraticProbing.insertKeyInHashTable("fox");
        quadraticProbing.displayHashTable();
    }
}
