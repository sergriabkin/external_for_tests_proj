package homeTasks.hw2.Sortings;

public class InsertionSort {
    public static void insertionSort(int[] elements) {
        for (int i = 1; i < elements.length; i++) {
            int key = elements[i];
            int j = i - 1;
            while (j >= 0 && key < elements[j]) {
                elements[j + 1] = elements[j];
                j--;
            }// end while loop
            elements[j + 1] = key;
        }// end for loop
    }
}
