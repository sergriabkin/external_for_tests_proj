package HomeTasks;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class HW1 {
    public static void main(String[] args) {
        fiboOptions(30);
    }

    private static int fiboRecursion(int n) {
        return (n < 2) ? n : fiboRecursion(n - 2) + fiboRecursion(n - 1);
    }

    private static int fibo(int n) {
        if (n < 2) return n;
        int last = 1;
        int prenul = 1;
        for (int i = 2; i < n; i++) {
            int result = last + prenul;
            prenul = last;
            last = result;
        }
        return last;
    }

    //just for fun:
    private static void fiboStreamToDisplay(int n) {
        if (n < 1) {
            System.out.println("There is no elements");
            return;
        }
        System.out.printf("Fibonacci sequence of %d numbers: " + 1 + " ", n);

        IntStream.generate(new IntSupplier() {
            int last = 1;
            int prenul = 0;

            @Override
            public int getAsInt() {
                int result = last + prenul;
                prenul = last;
                last = result;
                return last;
            }
        }).limit(n - 1).forEach(x -> System.out.print(x + " "));
    }

    private static void fiboOptions(int n) {
        System.out.println("Recursion result: " + fiboRecursion(n));
        System.out.println("Cycle result: " + fibo(n));

        fiboStreamToDisplay(n);
    }
}
