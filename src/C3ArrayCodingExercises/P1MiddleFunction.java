package C3ArrayCodingExercises;

import java.util.Arrays;

public class P1MiddleFunction {

    public static void main(String[] args) {
        new P1MiddleFunction();
    }

    public P1MiddleFunction(){
        int[] array = new int[4];
        array[0] = 1; array[1] = 2; array[2] = 3;
        array[3] = 4;

        int size = array.length;
        if(size % 2 == 0){
            int[] resultArray = new int[2];
            int divided = (size / 2) - 1;
            resultArray[0] = array[divided];
            resultArray[1] = array[divided + 1];
            System.out.println(Arrays.toString(resultArray));
        } else if(size % 2 != 0) {
            int[] resultArray = new int[1];
            int divided = (size / 2);
            resultArray[0] = array[divided];
            System.out.println(Arrays.toString(resultArray));
        }
    }
}
