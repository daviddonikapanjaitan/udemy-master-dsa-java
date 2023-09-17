package C24SortingAlgorithm;

public class P6QuickSort {

    public int partition (int[] array, int start, int end) {
        int pivot = end;
        int i = start - 1;
        for (int j = start; j <= end; j++) {
            if(array[j] <= array[pivot]){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        return i;
    }

    public void quickSort(int[] array, int start, int end) {
        if(start < end) {
            int pivot = partition(array, start, end);
            quickSort(array, start, pivot - 1);
            quickSort(array, pivot + 1, end);
        }
    }

    public void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        P6QuickSort qs = new P6QuickSort();
        int[] array = {10,3,2,7,7,5,8,4,1,2,9,7,8,11};
        qs.quickSort(array, 0, array.length - 1);
        qs.printArray(array);
    }
}
