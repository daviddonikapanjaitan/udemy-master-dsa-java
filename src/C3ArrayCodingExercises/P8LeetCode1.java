package C3ArrayCodingExercises;

import java.util.Arrays;

public class P8LeetCode1 {

    public static void main(String[] args) {
        new P8LeetCode1();
    }

    public P8LeetCode1() {
//        int[] nums = {2, 7, 11, 15};
//        int target = 9;
        int[] nums = {3, 2, 4};
        int target = 6;


        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if(i + 1 != nums.length && nums[i] < target){
                if(nums[i] + nums[i + 1] == target){
                    result[0] = i;
                    result[1] = i + 1;
                }
            }
        }

        System.out.println(Arrays.toString(result));
    }
}
