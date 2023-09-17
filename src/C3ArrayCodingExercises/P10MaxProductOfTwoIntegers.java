package C3ArrayCodingExercises;

import java.util.Arrays;

public class P10MaxProductOfTwoIntegers {

    public static void main(String[] args) {
        new P10MaxProductOfTwoIntegers();
    }

    public P10MaxProductOfTwoIntegers() {
//        int[] intArray = {10, 20, 30, 40, 50};
        int[] intArray = {10, 60, 3, 40, 50};

        int firstMax = 0;
        int secondMax = 0;
        String pairs = "";
        for (int j : intArray) {
            if (firstMax < j) {
                firstMax = j;
            }
        }

        for (int i = 0; i < intArray.length; i++) {
            if(secondMax < intArray[i] && intArray[i] != firstMax){
                secondMax = intArray[i];
            }
        }

        pairs = firstMax + "," + secondMax;

        System.out.println(pairs);
    }
}
