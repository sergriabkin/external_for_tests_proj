package lesson1;

public class Main1 {
    public static void main(String[] args) {
        Integer a1 = 100;
        Integer a2 = 100;

        System.out.println(a1 == a2);

        Integer b1 = 1000;
        Integer b2 = 1000;
        System.out.println(b1 == b2);

        Integer c1 = 1000;
        Integer c2 = 1000;
        Integer c3 = null;
        System.out.println(c1 == c2);
//        System.out.println(c1 - c3); //NullPointerException
        Integer c4 = (c1 - c2); // not ok system params

        Integer d1 = 100;
        Integer d2 = 100;
        Integer d3 = new Integer(100);
        System.out.println(d1==d2);
        System.out.println(d1==d3);


        Boolean bo1 = true;
        Boolean bo2 = true;
        Boolean bo3 = new Boolean(true);
        System.out.println(bo1 == bo2); //true because of POOL
        System.out.println(bo1 == bo3); // false!






    }
}
