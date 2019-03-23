package com.company.lesson3;

public class Main {
//    public static void main(String[] args) {
////        int [] arr1 = new int[10];
//        int[] arr2 [] = new int[10] [];
//        for (int i = 0; i < arr2.length; i++) {
//            arr2[i] = new int[i+1];
//        }
//
//        for ( final int [] element : arr2) {
//            System.out.println(Arrays.toString(element));
//        }
//    }
        public static void main(String[] args) {
            int result1 = sum(1,2);
            System.out.println(result1);
            int result2 = sum(1,2, 3);

            int [] arr = {1, 2, 3, 4};
            int res3 = sum(arr);
            int res4 = sum(1,2,3,4);
            System.out.println(res4);
            int res5 = sum(1);
            System.out.println(res5);

            int res6 = sum(1, 2, 3, 4, 5, 6);
            System.out.println(res6);

        }





    private static  int  sum (int ... arr){
        int sum = 0;
        //TODO implement
        for (int x: arr
        ) {
            sum += x;
        }
        return sum;
    }
//    private static  int  sum (int [] arr){
//        int sum = 0;
//        //TODO implement
//        for (int x: arr
//             ) {
//            sum += x;
//        }
//            return sum;
//    }


    private static int meth(int a, int...arr){  // ?
        return 0;
    }

    private static  int  sum (int a, int b, int c){
        return a*b;
    }

    private static  int  sum (int a, int b){
            return a*b;
        }

}
