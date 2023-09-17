package C3ArrayCodingExercises;

import java.util.Arrays;

public class P3BestScore {

    public static void main(String[] args) {
        new P3BestScore();
    }

    public P3BestScore() {
        int[] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};

        int first = 0;
        int second = 0;
        int[] result = new int[2];
        for (int i = 0; i < myArray.length; i++) {

            if(first <= myArray[i]){
                second = first;
                result[1] = second;

                first = myArray[i];
                result[0] = first;
            }
        }

        System.out.println(Arrays.toString(result));
    }
}
