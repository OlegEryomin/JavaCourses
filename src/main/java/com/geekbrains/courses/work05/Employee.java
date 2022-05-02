package com.geekbrains.courses.work05;

import java.math.BigDecimal;

public class Employee {
    String fullName;
    String position;
    String email;
    String phone;
    BigDecimal salary;
    int age;

    public Employee(String fullName, String position, String email, String phone, BigDecimal salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName= " + fullName +
                ", email= " + email +
                ", phone= " + phone +
                ", salary= " + salary +
                ", age= " + age +
                '}';
    }

    public void outputConsole() {
        System.out.println(toString());
    }


}

