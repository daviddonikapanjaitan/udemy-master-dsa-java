package C3ArrayCodingExercises;

import java.util.Arrays;

public class P5DuplicateNumber {

    public static void main(String[] args) {
        new P5DuplicateNumber();
    }

    public P5DuplicateNumber() {
        int[] arr = {1, 1, 2, 2, 3, 4, 5};

        int[] newArr = new int[arr[arr.length - 1]];
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if(temp != arr[i]){
                temp = arr[i];
            }else if (temp == arr[i]){
                continue;
            }

            newArr[temp - 1] = temp;
        }

        System.out.println(Arrays.toString(newArr));
    }
}
