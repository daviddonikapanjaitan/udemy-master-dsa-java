package C22Trie;

public class P3Search {

    public static void main(String[] args) {
        Trie newTrie = new Trie();
        newTrie.insert("API");
        newTrie.insert("APIS");
        newTrie.search("APS");
    }
}
