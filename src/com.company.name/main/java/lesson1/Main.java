package lesson1;

public class Main {

    private static final int N = 10;

    public static void main(String[] args) {
        byte ba;
        short sa;
        int ia;
        long la;

        byte b1 = 120;
        byte b2 = 120;
        byte b12 = (byte) (200 + 200);

        System.out.println("byte: " + b12);

        int i1 = 10;
        int i2 = 100;

        System.out.println(i1 + i2);
        System.out.println(i1 - i2);
        System.out.println(i1 * i2);
        System.out.println(i1 / i2);

        long l1 = 100_000_000_000_000L;

        System.out.println("___");

        float f1 = 10.0F;
        float f2 = 10.0F;

        double d1 = 10.0;
        double d2 = -10.0;

        System.out.println(d1 + d2);
        System.out.println(d1 - d2);
        System.out.println(d1 * d2);
        System.out.println(d1 / d2);

        System.out.println(Math.sqrt(d2));

        char ch = 'a';
        char c1 = '\u0000';
        System.out.println("___");
        System.out.println(c1);
        System.out.println("___");

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println();

//        int[] arr1 = new int[10];

//        int arr2[] = new int[10]; // not ok
//        int[] arr3[] = new int[10][10];// not ok

//        int[] arr1[], arr2; // 1 - 2mern , 2 - 1mern  -> not ok


        int[] arr1 = new int[10];

        for (int i = 0; i < arr1.length; i++) {
            if (i==5) {continue;}
            if (i==7) break;
            arr1[i] = i;
        }

        for (int el : arr1) {
            System.out.print(el+" ");
        }

        int[] arr2 = new int[10];
        for (int i = 0; i < arr2.length; i++) {
            if (i==5) {continue;}
            if (i==7) break;
            arr2[i] = i;
        }

        System.out.println();
        int k=0;
        do{
            System.out.println("hello");
        }while (false);


        System.out.println("___");



    }
}
