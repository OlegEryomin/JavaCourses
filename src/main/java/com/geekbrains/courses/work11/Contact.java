package com.geekbrains.courses.work11;

import java.util.HashSet;
import java.util.Set;

public class Contact {
    private String surname;
    private Set<String> phones = new HashSet<>();

    public Contact(String surname) {
        this.surname = surname;
    }

    public void phoneAdd(String phone) {
        this.phones.add(phone);
    }

    public String getSurname() {
        return surname;
    }

    public Set<String> getPhones() {
        return phones;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "surname='" + surname + '\'' +
                ", phones=" + phones +
                '}';
    }
}
