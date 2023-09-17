package C24SortingAlgorithm;

public class P3InsertionSort {

    // InsertionSort
    public void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i], j = i;
            while(j > 0 && arr[j - 1] > temp){
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }

    public void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        P3InsertionSort is = new P3InsertionSort();
        int[] arr = {10, 3, 2, 5, 8, 4, 3, 1};
        is.insertionSort(arr);
        is.printArray(arr);
    }
}
