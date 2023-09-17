package C24SortingAlgorithm;

public class P2SelectionSort {

    public void selectionSort(int[] a) {
        for (int j = 0; j < a.length; j++) {
            int minimumIndex = j;
            for (int i = j + 1; i < a.length; i++) {
                if(a[i] < a[minimumIndex]) {
                    minimumIndex = i;
                }
            }
            if(minimumIndex != j) {
                int temp = a[j];
                a[j] = a[minimumIndex];
                a[minimumIndex] = temp;
            }
        }
    }

    public void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 3, 2, 5, 8, 4, 1, 9};
        P2SelectionSort sort = new P2SelectionSort();
        sort.selectionSort(array);
        sort.printArray(array);
    }
}
