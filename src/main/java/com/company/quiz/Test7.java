package com.company.quiz;

import java.util.Arrays;

public class Test7 {

    public static void main(String[] args) {
     //   int [] arr = {1, 2, 3};


        byte [] a = {49, 50, 51, 52, 53, 54, 55};
        String b = new String(a);
        System.out.println(b);
        String c = new String(a, 2, 4);

        System.out.println(c);

        int f = 5;
        f = ++f + f++ ;
        System.out.println(f);



    }

    public static int [] reverse(int [] ar){
        int [] ar2 = new int [ar.length];
        for (int i = 0; i < ar.length; i++) {
            ar2 [(ar.length-1) -i] = ar[i];
        }
        return ar2;
    }

}
