package com.geekbrains.courses.work10;

import java.util.HashMap;
import java.util.Set;

public class PhoneBook {

    private HashMap<String, Set<String>> contact = new HashMap<>();

    public void add(Contact contact) {
        this.contact.put(contact.getSurname(), contact.getPhones());
    }

    public Set<String> get(String surname) {
       return this.contact.get(surname);
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "contact=" + contact +
                '}';
    }
}
