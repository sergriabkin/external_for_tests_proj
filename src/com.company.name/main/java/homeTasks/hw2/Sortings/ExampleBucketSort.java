package homeTasks.hw2.Sortings;

import java.util.Arrays;

public class ExampleBucketSort {
    public static int[] bucketSort(int[] arr) {
        int i, j;
        int[] bucket = new int[arr.length+1];
        Arrays.fill(bucket, 0);

        for (i = 0; i < arr.length; i++) {
            bucket[arr[i]]++;
        }

        int k=0;
        for (i = 0; i < bucket.length; i++) {
            for (j = 0; j<bucket[i]; j++) {
                arr[k++] = i;
            }
        }
        return arr;
    }
}
