package homeTasks.hw2.Sortings;

public class SelectionSort {

    public static void sort(int [] numbers){
        int n = numbers.length;
        selectionSort(numbers, 0, n-1);
    }


    // Selection sort algorithm
    public static void selectionSort(int[] numbers, int low, int high) {
        for (int h = low; h <= high; h++)
            swap(numbers, h, getSmallest(numbers, h, high));
    }

    // Get the position of the smallest value from numbers[low] to numbers[high]
    public static int getSmallest(int[] numbers, int low, int high) {
        int small = low;
        for (int i = low + 1; i <= high; i++)
            if (numbers[i] < numbers[small])
                small = i;
        return small;
    }

    // swap numbers
    public static void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

}