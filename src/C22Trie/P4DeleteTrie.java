package C22Trie;

public class P4DeleteTrie {

    public static void main(String[] args) {
        Trie newTrie = new Trie();
        newTrie.insert("API");
        newTrie.insert("APIS");
        newTrie.delete("API");
        newTrie.search("API");
    }
}
