package lesson2.oop;

public class ConsoleApp {
    public static void main(String[] args) {
        Student student1 = new Student(1L, "Alex1");
        Student student2 = new Student(2L, "Alex2");

        StudentType studentType = StudentType.BAD_STUDENT;
        StudentType goodSt = StudentType.valueOf("GOOD_STUDENT");
        StudentType[] values = StudentType.values();

        String name = StudentType.GOOD_STUDENT.name();
        System.out.println(name);
        System.out.println(StudentType.GOOD_STUDENT);

        System.out.println("__________");
        System.out.println("test:");
        System.out.println(StudentType.myValueOf("GOOD_STUDENT"));
        System.out.println(StudentType.myValueOf("GasdasdNT"));
        System.out.println(StudentType.myValueOf(null));
        System.out.println("__________");


        int a = 5;

        if (a>0  || ++a <11){  //  checking 1 option and go
            System.out.println(a);
        }

        if (a>0  | ++a <11){  // checking all options
            System.out.println(a);
        }


//        String name2 = "Oleg";
//        switch (name2){
//            case "Oleg":
//                System.out.println("YES");
//            case "Alex":
//                System.out.println("No Alex");
//        }//both because no brake

       String xxx = method("Oleg");
        System.out.println(xxx);

    }

    private static String  method(String name2) {
//        String name2 = "Oleg";
        switch (name2){
            case "Oleg":
                return "YES";

            case "Alex":
                return "No Alex";

                default:
                    return "No";
        }
    }
}
