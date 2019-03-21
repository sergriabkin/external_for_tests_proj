package lesson2;

public class Calculator {

    public static final String PLUS = "+";
    public static final String MINUS = "-";
    public static final String MULT = "*";
    public static final String DIV = "/";

    public static double calc(double arg1, String operation, double arg2){
        switch (operation){
            case PLUS:
                return arg1+arg2;
            case MINUS:
                return arg1-arg2;
            case MULT:
                return arg1*arg2;
            case DIV:
                return arg1/arg2;

                default: throw new IllegalArgumentException("message");
        }

//        if ("+".equals(operation)){
//            return arg1+arg2;
//        }
//        if ("-".equals(operation)){
//            return arg1-arg2;
//        }
//        if ("*".equals(operation)){
//            return arg1*arg2;
//        }
//        if ("/".equals(operation)){
//            return arg1/arg2;
//        }
////        return 0.0;
//        throw new IllegalArgumentException("message");
    }




    public static void main(String[] args) {
       double r = calc(2,"+", 3);
        System.out.println(r);
    }
}
