package C24SortingAlgorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class P4BucketSort {

    int[] arr;

    public P4BucketSort(int[] arr) {
        this.arr = arr;
    }

    public void printArray(){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Print Buckets
    public void printBucket(ArrayList<Integer>[] buckets) {
        for (int i = 0; i < buckets.length; i++) {
            System.out.println("\nBucket#" + i + ": ");
            for (int j = 0; j < buckets[i].size(); j++) {
                System.out.print(buckets[i].get(j) + " ");
            }
        }
    }

    // BucketSorting
    public void bucketSort() {
        int numberOfBuckets = (int) Math.ceil(Math.sqrt(arr.length));
        int maxValue = Integer.MIN_VALUE;
        for(int value: arr){
            if(value > maxValue){
                maxValue = value;
            }
        }

        ArrayList<Integer>[] buckets = new ArrayList[numberOfBuckets];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<Integer>();
        }

        for(int value: arr) {
            int bucketNumber = (int) Math.ceil((float) value * numberOfBuckets/ (float) maxValue);
            buckets[bucketNumber - 1].add(value);
        }

        System.out.println("\n\nPrinting buckets before sorting...");
        printBucket(buckets);

        for(ArrayList<Integer> bucket: buckets){
            Collections.sort(bucket);
        }

        System.out.println("\n\nPrinting buckets after sorting...");
        printBucket(buckets);

        int index = 0;
        for(ArrayList<Integer> bucket: buckets){
            for(int value: bucket){
                arr[index] = value;
                index++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {9,7,5,4,2,1,3,6,8};
        P4BucketSort bs = new P4BucketSort(arr);
        bs.printArray();
        bs.bucketSort();
        System.out.println();
        bs.printArray();

    }
}
