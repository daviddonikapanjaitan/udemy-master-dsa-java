package C3ArrayCodingExercises;

public class P11LeetCode217 {

    public static void main(String[] args) {
        new P11LeetCode217();
    }

    public P11LeetCode217(){
        int[] intArray = {1,2,3,4,5,6};

        int temp = 0;
        boolean result = true;
        for (int i = 1; i < intArray.length; i++) {
            if(temp == intArray[i]){
                result = false;
                break;
            }
            temp = intArray[i];
        }

        System.out.println(result);
    }
}
