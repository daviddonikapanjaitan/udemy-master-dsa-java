package C38DivideAndConquerCodingExercises;

public class P1CountZeroes {

    public static int countZeroes(int[] array) {
        int left = 0;
        int right = array.length;
        while(left <= right) {
            int middle = (int) (left + right) / 2;
            if (array[middle] == 1) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return array.length - left;
    }

    public static void main(String[] args) {
        int[] inputArray = {1,1,1,1,0,0};
        int result = countZeroes(inputArray);
        System.out.println(result);
    }
}
