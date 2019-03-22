package homeTasks.hw2.Sortings;


//import java.io.File;
//import java.io.IOException;
//import java.lang.reflect.InvocationTargetException;
//import java.nio.file.Files;
//import java.util.Arrays;
//import java.util.Set;
//import java.util.stream.Collectors;

/*
1. Нужно написать реализацию 5 сортировок на выбор.
 И каждую из выбраных сортировок испытать на массиве размером 1_000_000 так подсчитать время выполнения.
Hint:
Можно заглянуть сюда https://habr.com/ru/post/204600/
Обратите внимание на  System.arraycopy(......), class Arrays.
 */
public class SortingsApp {

    public static final int N = 30;

    public static void main(String[] args) {
        int[] unsortedArr = new int[N];
        for (int i = 0; i < unsortedArr.length; i++) {
            unsortedArr[i] = (int) (Math.random() * 100);
        }

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
    }

}
