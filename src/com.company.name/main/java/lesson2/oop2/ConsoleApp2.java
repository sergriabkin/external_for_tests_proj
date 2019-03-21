package lesson2.oop2;

public class ConsoleApp2 {

    public static void main(String[] args) {

        A a1 = new A();
        A a2 = null;

        a1.method();
//        a2.method();

        A.staticMethod(); //a1.staticMethod() -> not ok
    }





}
