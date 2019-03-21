package lesson2.oop;

public enum StudentType2 {

    GOOD_STUDENT(1),
    BAD_STUDENT(2, "ss"); // can ovveride methods useing anonymus class

//    static StudentType myValueOf(String value){
//        for ( StudentType studentType : StudentType.values()
//        ) {
//            if (studentType.toString().equals(value)) return studentType;
//        }
//        return null;
//    }

    private int rate;
    private String name;

    StudentType2(int rate) {
        this.rate = rate;
    }

    StudentType2(int rate, String name) {
        this.rate = rate;
        this.name = name;
    }
}


