package com.company.dto;

public class Student {
    private String name;
    private int age;
    private String gender;
    private String regNo;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getGender(){
        return gender;
    }

    public String getRegNo(){
        return regNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

}
