package C25SearchingAlgorithms;

public class P1LinearSearch {

    public int linearSearch(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == value) {
                System.out.println("The element is found at the index: " + i);
                return i;
            }
        }
        System.out.println("The element " + value + " not found");
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 10, 23, 11};
        P1LinearSearch ls = new P1LinearSearch();
        ls.linearSearch(arr, 300);
    }
}
