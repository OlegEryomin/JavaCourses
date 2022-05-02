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
    }
}
