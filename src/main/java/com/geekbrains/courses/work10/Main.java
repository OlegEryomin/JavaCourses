package com.geekbrains.courses.work10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    }
}
