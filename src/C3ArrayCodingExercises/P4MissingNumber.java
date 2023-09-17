package C3ArrayCodingExercises;

public class P4MissingNumber {

    public static void main(String[] args) {
        new P4MissingNumber();
    }

    public P4MissingNumber(){
        int [] arr = {1,2,3,4,6};

        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            if(i + 1 != arr[i]){
                temp = i + 1;
                break;
            }
        }

        System.out.println(temp);
    }
}
