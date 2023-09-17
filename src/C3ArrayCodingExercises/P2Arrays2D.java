package C3ArrayCodingExercises;

public class P2Arrays2D {

    public static void main(String[] args) {
        new P2Arrays2D();
    }

    public P2Arrays2D(){
        int[][] myArray2D= {{1,2,3},{4,5,6},{7,8,9}};

        int sum = 0;
        for (int i = 0; i < myArray2D.length; i++) {
            sum += myArray2D[i][i];
        }

        System.out.println(sum);
    }
}
