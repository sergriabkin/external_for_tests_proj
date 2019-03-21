package com.company.name.main.java.tests;

public class Test3 {
    public static void main(String[] args) {
        String s1 = "2";
        String s2 = "2";
        String s3 = new String("2");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println("____");
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        System.out.println("____");
        int i1 = 012;
        System.out.println(i1);
        System.out.println("___");

        p1:
        {
            p2:
            {
                p3:
                {
                    System.out.print("p3.1 ");
                    if (true) break p2;
                    System.out.print("p3.2 ");
                }
                System.out.print("p2 ");
            }
            System.out.print("p1 ");
        }
    }
}

