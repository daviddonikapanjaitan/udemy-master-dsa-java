package C5CrackingBiOInterviewArrays;

public class P2Question2 {

    public static void main(String[] args) {
        new P2Question2();
    }

    public P2Question2() {
        int[] customArray = {1, 3, 4, 5};
        printPairs(customArray);
    }

    void printPairs(int[] array){
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i] + ", " + array[j]);
            }
        }
    }
}
