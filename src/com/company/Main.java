package com.company;

import com.company.dto.Student;

public class Main {

    public static void main(String[] args) {
        Student student=new Student();
        student.setName("Bella");
        student.setAge(20);
        student.setGender("female");
        student.setRegNo("CT201/102082/20");

        System.out.println("Display student : " + student.toString());
    }
}
