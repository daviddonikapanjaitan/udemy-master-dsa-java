package C5CrackingBiOInterviewArrays;

import java.util.Arrays;

public class P3ReverseArray {

    public static void main(String[] args) {
        new P3ReverseArray();
    }

    public P3ReverseArray(){
        int[] customArray = {1, 3, 4, 5};
        reverse(customArray);
    }

    void reverse(int[] array){
        for (int i = 0; i < array.length / 2; i++) {
            int other = array.length - i - 1;
            int temp = array[i];
            array[i] = array[other];
            array[other] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
