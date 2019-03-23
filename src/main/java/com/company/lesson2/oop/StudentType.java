package com.company.lesson2.oop;

public enum StudentType {
//    GOOD_STUDENT, BAD_STUDENT
    GOOD_STUDENT, BAD_STUDENT;

    static StudentType myValueOf(String value){
        for ( StudentType studentType : StudentType.values()
             ) {
            if (studentType.toString().equals(value)) return studentType;
        }
        return null;
    }


//    private int rate;
//    private String name;
//
//    StudentType(int rate) {
//        this.rate = rate;
//    }
//
//    StudentType(int rate, String name) {
//        this.rate = rate;
//        this.name = name;
//    }
}
