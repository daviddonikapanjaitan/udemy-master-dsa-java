package C1Array;

import java.util.Arrays;

public class P2TwoDimensionArray {

    int arr[][] = null;

    // Constructor
    public P2TwoDimensionArray(int numberOfRows, int numberOfColumns){
        this.arr = new int[numberOfRows][numberOfColumns];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    // Inserting value in the Array
    public void insertValueInTheArray(int row, int col, int value){
        try {
            if(arr[row][col] == Integer.MIN_VALUE){
                arr[row][col] = value;
                System.out.println("The value is successfully inserted");
            } else {
                System.out.println("The cell is already occupied");
            }
        } catch (Exception e) {
            System.out.println("Invalid index for 2D array");
        }
    }

    // Accessing cell value from given array
    public void accessCell(int row, int col){
        System.out.println("\nAccess Row#" + row + ", Col#" + col);
        try{
            System.out.println("Cell value is: " + arr[row][col]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for 2D array");
        }
    }

    // Traverse 2D Array
    public void traverse2DArray(){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[0].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    // Searching a single value from the array
    public void searchingValue(int value){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col] == value){
                    System.out.println("Value is found at row: " + row + " Col: " + col);
                    return;
                }
            }
        }
        System.out.println("Value is not found");
    }

    // Deleting a value from Array
    public void deleteValueFromArray(int row, int col) {
        try {
            System.out.println("Successfully deleted: " + arr[row][col]);
            arr[row][col] = Integer.MIN_VALUE;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This index not valid for array");
        }
    }

    public static void main(String[] args) {
//        int[][] int2DArray;
//        int2DArray = new int[2][2];
//        int2DArray[0][0] = 1;
//        int2DArray[0][1] = 2;
//        int2DArray[1][0] = 3;
//        int2DArray[1][1] = 4;
//        System.out.println(Arrays.deepToString(int2DArray));
//        String s2DArray[][] = {{"a", "b"}, {"c", "d"}};
//        System.out.println(Arrays.deepToString(s2DArray));

//        P2TwoDimensionArray sda = new P2TwoDimensionArray(3, 3);
//        sda.insertValueInTheArray(0, 0, 10);
//        System.out.println(Arrays.deepToString(sda.arr));

//        P2TwoDimensionArray sda = new P2TwoDimensionArray(3, 3);
//        sda.insertValueInTheArray(0, 0, 10);
//        sda.insertValueInTheArray(0, 1, 20);
//        sda.accessCell(0, 1);

//        P2TwoDimensionArray sda = new P2TwoDimensionArray(3, 3);
//        sda.insertValueInTheArray(0, 0, 10);
//        sda.insertValueInTheArray(0, 1, 20);
//        sda.insertValueInTheArray(1, 0, 30);
//        sda.insertValueInTheArray(2, 0, 40);
//        sda.traverse2DArray();

//        P2TwoDimensionArray sda = new P2TwoDimensionArray(3, 3);
//        sda.insertValueInTheArray(0, 0, 10);
//        sda.insertValueInTheArray(0, 1, 20);
//        sda.insertValueInTheArray(1, 0, 30);
//        sda.insertValueInTheArray(2, 0, 40);
//        sda.searchingValue(60);

        P2TwoDimensionArray sda = new P2TwoDimensionArray(3, 3);
        sda.insertValueInTheArray(0, 0, 10);
        sda.insertValueInTheArray(0, 1, 20);
        sda.insertValueInTheArray(1, 0, 30);
        sda.insertValueInTheArray(2, 0, 40);
        System.out.println(Arrays.deepToString(sda.arr));
        sda.deleteValueFromArray(0, 0);
        System.out.println(Arrays.deepToString(sda.arr));
    }
}
