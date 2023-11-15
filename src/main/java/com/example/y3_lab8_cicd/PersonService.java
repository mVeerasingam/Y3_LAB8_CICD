package com.example.y3_lab8_cicd;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PersonService {
    ArrayList<Person> personArrayList = new ArrayList<>();

    // placeholder method to save a person (add to db in the next 2 weeks)
    public void savePerson(Person person){
        personArrayList.add(person);
        System.out.println("Person saved: " + person);
    }

    public Person getPersonByEmployeeId(String employeeId) {
        // fetch data from a db in a future lab
        // for simplicity, we return a dummy person here

        return new Person();
        //return personArrayList.stream().filter(person -> person.getEmployeeId()==employeeId){}


    }
}
