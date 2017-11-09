package com.delete.demo.domain;

import java.util.List;

public class PersonList {
    private List<Person> people;

    public void addPerson(Person person){
        people.add(person);
    }
}
