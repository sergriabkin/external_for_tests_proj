package com.company.homeTasks.hw2;

import com.company.homeTasks.hw2.Sortings.*;

import java.util.Arrays;

public class SortingsApp {

    public static final int N = 100;

    public static void main(String[] args) {
        int[] unsortedArr = new int[N];
        for (int i = 0; i < unsortedArr.length; i++) {
            unsortedArr[i] = (int) (Math.random() * 100);
        }

        System.out.println("Nano-seconds per sorting:\n");

        System.out.println(InsertionSort.class.getSimpleName());
        int[] ar1 = new int[N];
        System.arraycopy(unsortedArr, 0, ar1, 0, N);
        long t1 = System.nanoTime();
        InsertionSort.insertionSort(ar1);
        System.out.println(System.nanoTime() - t1);

        System.out.println(BubbleSort.class.getSimpleName());
        int[] ar2 = new int[N];
        System.arraycopy(unsortedArr, 0, ar2, 0, N);
        long t2 = System.nanoTime();
        BubbleSort.bubbleSort(ar2);
        System.out.println(System.nanoTime() - t2);

        System.out.println(HeapSort.class.getSimpleName());
        int[] ar3 = new int[N];
        System.arraycopy(unsortedArr, 0, ar3, 0, N);
        long t3 = System.nanoTime();
        HeapSort.heapsort(ar3);
        System.out.println(System.nanoTime() - t3);

        System.out.println(MergeSort.class.getSimpleName());
        int[] ar4 = new int[N];
        System.arraycopy(unsortedArr, 0, ar4, 0, N);
        long t4 = System.nanoTime();
        MergeSort.sort(ar4);
        System.out.println(System.nanoTime() - t4);

        System.out.println(QuickSort.class.getSimpleName());
        int[] ar5 = new int[N];
        System.arraycopy(unsortedArr, 0, ar5, 0, N);
        long t5 = System.nanoTime();
        QuickSort.sort(ar5);
        System.out.println(System.nanoTime() - t5);

        System.out.println(SelectionSort.class.getSimpleName());
        int[] ar6 = new int[N];
        System.arraycopy(unsortedArr, 0, ar6, 0, N);
        long t6 = System.nanoTime();
        SelectionSort.sort(ar6);
        System.out.println(System.nanoTime() - t6);

        System.out.println(Shellsort.class.getSimpleName());
        int[] ar7 = new int[N];
        System.arraycopy(unsortedArr, 0, ar7, 0, N);
        long t7 = System.nanoTime();
        Shellsort.shellSort(ar7);
        System.out.println(System.nanoTime() - t7);


        System.out.println("Arrays.sort() of Java");
        int[] ar8 = new int[N];
        System.arraycopy(unsortedArr, 0, ar8, 0, N);
        long t8 = System.nanoTime();
        Arrays.sort(ar8);
        System.out.println(System.nanoTime() - t8);

        System.out.println("\nUnsorted array:");
        System.out.println(Arrays.toString(unsortedArr));

        System.out.println("\nResults:");
        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.toString(ar2));
        System.out.println(Arrays.toString(ar3));
        System.out.println(Arrays.toString(ar4));
        System.out.println(Arrays.toString(ar5));
        System.out.println(Arrays.toString(ar6));
        System.out.println(Arrays.toString(ar7));
        System.out.println(Arrays.toString(ar8));

    }

}
