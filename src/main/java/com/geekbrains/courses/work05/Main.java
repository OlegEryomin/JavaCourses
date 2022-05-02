package com.geekbrains.courses.work05;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Employee em = new Employee("Eryomin Oleg Aleksandrovich",
                                    "developer",
                                    "eremin_o@bsu.edu.ru",
                                    "+7-920-555-55-55",
                                    new BigDecimal(5000), 21);

        System.out.println(em.toString());

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Eryomin Oleg Aleksandrovich",
                                    "developer",
                                    "eremin_o@bsu.edu.ru",
                                    "+7-920-555-55-55",
                                    new BigDecimal(5000), 21);
        employees[1] = new Employee("Shubin Maxim Sergeevich",
                                    "developer",
                                    "sasbaa@ya.ru",
                                    "+7-920-555-55-56",
                                    new BigDecimal(5000), 22);
        employees[2] = new Employee("Komov Pavel Evgenevich",
                                    "sheriff",
                                    "2121312@ya.ru",
                                    "+7-920-555-55-57",
                                    new BigDecimal(1000), 45);
        employees[3] = new Employee("Nechaev Vlad Aleksandrovich",
                                    "security guard",
                                    "nechaev@ya.ru",
                                    "+7-920-555-55-58",
                                    new BigDecimal(1000), 50);
        employees[4] = new Employee("Glazkov Roman Aleksandrovich",
                                    "engineer",
                                    "glazkov@ya.ru",
                                    "+7-920-555-55-59",
                                    new BigDecimal(5000), 22);
        for (int i =0; i < employees.length; i++) {
            if (employees[i].age > 40) {
                System.out.println(employees[i].toString());
            }
        }
    }


}
