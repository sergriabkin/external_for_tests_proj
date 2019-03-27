package com.company.homeTasks.hw2;

import com.company.homeTasks.hw2.Sortings.BubbleSort;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortingsAppTest {

    private static final int[] testArr = {10, 71, 47, 28, 54, 96, 47, 2, 19, 22, 52, 47,
            17, 58, 11, 54, 36, 77, 55, 86, 32, 36, 67, 10, 48, 65, 68, 72, 93, 80,
            66, 74, 97, 25, 20, 42, 93, 27, 75, 7, 55, 27, 71, 69, 69, 1, 75, 32, 26,
            0, 15, 77, 13, 89, 76, 24, 77, 65, 16, 79, 65, 21, 97, 95, 98, 19, 62, 59,
            16, 3, 16, 49, 63, 35, 34, 90, 88, 71, 99, 84, 53, 58, 29, 69, 76, 90, 47,
            36, 37, 19, 80, 87, 49, 89, 36, 20, 39, 97, 58, 90};
    private static final int[] expectedArr = {0, 1, 2, 3, 7, 10, 10, 11, 13, 15, 16, 16, 16,
            17, 19, 19, 19, 20, 20, 21, 22, 24, 25, 26, 27, 27, 28, 29, 32, 32, 34, 35,
            36, 36, 36, 36, 37, 39, 42, 47, 47, 47, 47, 48, 49, 49, 52, 53, 54, 54, 55,
            55, 58, 58, 58, 59, 62, 63, 65, 65, 65, 66, 67, 68, 69, 69, 69, 71, 71, 71,
            72, 74, 75, 75, 76, 76, 77, 77, 77, 79, 80, 80, 84, 86, 87, 88, 89, 89, 90,
            90, 90, 93, 93, 95, 96, 97, 97, 97, 98, 99};


    @Test
    public void shouldSortByBubbleSort() {
        int[] actualArr = new int[100];
        System.arraycopy(testArr, 0, actualArr, 0, 100);
        BubbleSort.bubbleSort(actualArr);
        for (int i = 0; i < 100; i++) {
            int actual = actualArr[i];
            int expected = expectedArr[i];
            assertEquals(expected, actual);
        }
    }

}