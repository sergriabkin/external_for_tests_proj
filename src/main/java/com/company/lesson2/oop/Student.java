package com.company.lesson2.oop;

import java.util.HashMap;
import java.util.Map;

public class Student {
    public static final String STUDENT_NAME ;
    public static final String STUDENT_NAME2 = init();
    private static final Map<String,String> map = new HashMap<>();

    private final Long id;
    private final String name;
//    private String type;
    private StudentType type;
//    private final String surname;
//    private final LocalDate date;

    static {
        STUDENT_NAME = "ALEX";
        map.put("One", "1");
        System.out.println("First static block");
    }

    {
        System.out.println("Non static");
        type = StudentType.GOOD_STUDENT;
    }

    static {
        System.out.println("Second static block");
    }

    public Student(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    //    public Student(Long id, String name, String surname, LocalDate date) { // with final only this option
//        this.id = id;
//        this.name = name;
//        this.surname = surname;
//        this.date = date;
//    }
//
//    public Student(String name, String surname, LocalDate date) { // or this
//        this.id = null;
//        this.name = name;
//        this.surname = surname;
//        this.date = date;
//    }

    //    public Student(Long id, String name) {
//        this.id = id;
//        this.name = name;
//    }
////    public Student(String surname, Long id ) { // Long id, String surname - not ok anymore
////        this.id = id;
////        this.surname = surname;
////    }
//    public Student( String name , Long id) {
////        super();
//        this(id, name);
//    }

    public Student setName(String name){
        return new Student(this.id, name);
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

//    public String getSurname() {
//        return surname;
//    }
//
//    public LocalDate getDate() {
//        return date;
//    }

    private static String init(){
        return "NAME";
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student sudent = (Student) o;
//        return Objects.equals(id, sudent.id) &&
//                Objects.equals(name, sudent.name) &&
//                Objects.equals(surname, sudent.surname) &&
//                Objects.equals(date, sudent.date);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, surname, date);
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", date=" + date +
//                '}';
//    }
}
