package C3ArrayCodingExercises;

public class P6RemoveDuplicates {

    public static void main(String[] args) {
        new P6RemoveDuplicates();
    }

    public P6RemoveDuplicates() {
        int[] nums = {1, 1, 2};

        int newLength = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if(temp != nums[i]){
                temp = nums[i];
                newLength++;
            }
        }

        System.out.println(newLength);
    }
}
