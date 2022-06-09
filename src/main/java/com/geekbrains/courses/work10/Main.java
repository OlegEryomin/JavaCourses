package com.geekbrains.courses.work10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Spring");
        list.add("универсальный");
        list.add("фреймворк");
        list.add("Java");
        list.add("Spring");
        list.add("обеспечивает");
        list.add("решения");
        list.add("многих");
        list.add("задач");
        list.add("Java");

        Set<String> set = new HashSet<>(list);
        System.out.println(set);
        for (String s : set) {
            System.out.println("Слово: " + s);
            int i = 0;
            for (String l : list) {
                if (s == l) {
                    i++;
                }
            }
            System.out.println("Встречается: " + i + " раз(а)");
        }

        ///////////////Задание 2
        PhoneBook phoneBook = new PhoneBook();
        Contact contact = new Contact("Гальцев");
        contact.phoneAdd("2254");
        contact.phoneAdd("2253");
        phoneBook.add(contact);

        Contact contact2 = new Contact("Шубин");
        contact2.phoneAdd("2379");
        contact2.phoneAdd("2378");
        phoneBook.add(contact2);

        Contact contact3 = new Contact("Еремин");
        contact3.phoneAdd("5555");
        contact3.phoneAdd("4444");
        phoneBook.add(contact3);

        System.out.println(phoneBook);
        System.out.println(phoneBook.get("Шубин"));




    }
}
