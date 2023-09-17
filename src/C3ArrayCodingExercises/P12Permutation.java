package C3ArrayCodingExercises;

public class P12Permutation {

    public static void main(String[] args) {
        new P12Permutation();
    }

    public P12Permutation(){
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {5,1,2,3,4};

        boolean result = false;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if(array1[i] == array2[j]){
                    result = true;
                    break;
                }
            }

            if (!result){
                break;
            }
        }

        System.out.println(result);
    }
}
