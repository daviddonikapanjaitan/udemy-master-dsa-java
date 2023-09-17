package C3ArrayCodingExercises;

public class P9FindingNumberInArray {

    public static void main(String[] args) {
        new P9FindingNumberInArray();
    }

    public P9FindingNumberInArray(){
        int[] intArray = {1, 2, 3, 4, 5, 6};
        int valueToSearch = 6;

        int result = 0;
        for (int i = 0; i < intArray.length; i++) {
            if(valueToSearch == intArray[i]){
                result = i;
            }
        }

        System.out.println(result);
    }
}
