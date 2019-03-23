package com.company.tests;

public class Test4 {
    /*
    Основываясь на
    <a href='http://docs.oracle.com/javase/specs/jls/se7/html/jls-12.html'>http://docs.oracle.com/javase/specs/jls/se7/html/jls-12.html</a>
    предлагаю следующую цепочку событий:
1)	В методе main() попытка присвоить значение переменной y класса Y вызывает инициализацию класса Y.
Класс загружается, верифицируется и подготавливается, при этом в процессе подготовки переменная y получает значение null.
2)	Далее, в процессе инициализации Y.y происходит обращение к X.x, что вызывает инициализацию класса X,
во время которой переменной X.x присваивается значение Y.y, которое на данный момент null;
3)	Завершается инициализация класса Y, переменной Y.y присваивается значение X.x равное null.
4)	В методе main() переменной Y.y присваивается значение “0”.
5)	В заключение, выводится на консоль значение переменной X.x, которое, согласно пункту 2 равно null;
     */

    static class X {
        static String x = Y.y;
    }

    static class Y {
        static String y = X.x;
    }

    public static void main(String[] args) throws Throwable {
        Y.y = "0";
        System.out.println(X.x);
    }
}
