package C24SortingAlgorithm;

public class P7HeapSort {

    int[] arr = null;

    public P7HeapSort(int[] arr) {
        this.arr = arr;
    }

    public void sort() {
        BinaryHeap bh = new BinaryHeap(arr.length);
        for (int i = 0; i < arr.length; i++) {
            bh.insert(arr[i], "Min");
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = bh.extractHeadOfBP("Min");
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
        int[] arr = {2,7,3,1,4,8,9};
        P7HeapSort hs = new P7HeapSort(arr);
        hs.sort();;
        hs.printArray(arr);
    }
}
