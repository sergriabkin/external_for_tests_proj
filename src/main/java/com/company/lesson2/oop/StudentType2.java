package com.company.lesson2.oop;

public enum StudentType2 {

    GOOD_STUDENT(1),
    BAD_STUDENT(2, "ss"); // u can override methods using anonymous class
    // elements are objects (instance of StudentType2)

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

    public int getRate() {
        return rate;
    }
}


