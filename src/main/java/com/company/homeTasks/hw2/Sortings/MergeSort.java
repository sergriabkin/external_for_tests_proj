package com.company.homeTasks.hw2.Sortings;

public class MergeSort {

    public static void sort(int [] numbers){
        int n = numbers.length;
        mergeSort(numbers, 0, n-1);
    }

    /*
     * Internal method that makes recursive calls to sort the data
     * elements is the array of elements to be sorted
     * low is the left most position of the array
     * high is the right most position of the array
     */
    public static void mergeSort(int[] elements, int low, int high) {
        if (low < high) { // list contains at least 2 elements
            int mid = (low + high) / 2;
            mergeSort(elements, low, mid); // recursion : sort first half
            mergeSort(elements, mid + 1, high); // recursion : sort second half
            merge(elements, low, mid, high); // merge both sorted halves
        }
    }

    /*
     * Merge sorted array of elements from low to mid and mid+1
     * low is the left most position of the subset of elements
     * high is the right most position of the subset of elements
     */
    private static void merge(int[] subset, int low, int mid, int high) {

        int n = high-low+1;
        int[] Temp = new int[n];

        int i = low, j = mid + 1;
        int k = 0;

        while (i <= mid || j <= high) {
            if (i > mid)
                Temp[k++] = subset[j++];
            else if (j > high)
                Temp[k++] = subset[i++];
            else if (subset[i] < subset[j])
                Temp[k++] = subset[i++];
            else
                Temp[k++] = subset[j++];
        }

        for (j = 0; j < n; j++)
            subset[low + j] = Temp[j];
    } // end merge

}