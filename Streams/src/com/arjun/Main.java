package com.arjun;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();

        Person p = new Person();

        p.add();
//        ArrayList<T> ti = new ArrayList<T>();

        Person person1 = new Person();
        person1.setName("Arjun");
        person1.setAge(23);
        person1.setGender("MALE");
        person1.setSalary(45000);
        personList.add(person1);

        Person person2 = new Person();
        person2.setName("Abi");
        person2.setAge(23);
        person2.setGender("MALE");
        person2.setSalary(46000);
        personList.add(person2);

        Person person3 = new Person();
        person3.setName("Suhan");
        person3.setAge(24);
        person3.setGender("MALE");
        person3.setSalary(56000);
        personList.add(person3);

        Person person4 = new Person();
        person4.setName("Arfa");
        person4.setAge(23);
        person4.setGender("FEMALE");
        person4.setSalary(49000);
        personList.add(person4);

        Person person5 = new Person();
        person5.setName("Sooraj");
        person5.setAge(23);
        person5.setGender("MALE");
        person5.setSalary(34000);
        personList.add(person5);

        Person person6 = new Person();
        person6.setName("Abhijith");
        person6.setAge(23);
        person6.setGender("MALE");
        person6.setSalary(40000);
        personList.add(person6);

        Person person7 = new Person();
        person7.setName("Arathy");
        person7.setAge(23);
        person7.setGender("FEMALE");
        person7.setSalary(50000);
        personList.add(person7);

        Person person8 = new Person();
        person8.setName("Aparn");
        person8.setAge(22);
        person8.setGender("FEMALE");
        person8.setSalary(40000);
        personList.add(person8);

        Person person9 = new Person();
        person9.setName("Rithin");
        person9.setAge(26);
        person9.setGender("MALE");
        person9.setSalary(50000);
        personList.add(person9);

        Person person10 = new Person();
        person10.setName("Siju");
        person10.setAge(25);
        person10.setGender("MALE");
        person10.setSalary(39000);
        personList.add(person10);


//        for (Person e: personList) {
//            System.out.println(e);
//        }



//        personList.forEach(System.out::println);


//        filter, map, reduce;

//        personList.stream()
//                .filter(person -> person.getAge() > 23)
//                .forEach(System.out::println);

//       personList.stream()
//               .filter(person -> person.getGender().equals("FEMALE"))
//               .map(person -> person.getName())
//               .forEach(System.out::println);

//        personList.stream()
//                .map(person -> person.getSalary() + 1000)
//                .filter(salary -> salary > 40000)
//                .forEach(System.out::println);


//        personList.stream()
//                .filter(person -> person.getSalary() < 40000)
//                .map(person -> person.getSalary() + 1000)
//                .forEach(System.out::println);

//        Optional<String> son = personList.stream()
//                .filter(person -> person.getGender().equals("MALE"))
//                .map(Person::getName)
//                .findFirst();
//
//        son.ifPresent(System.out::println);



    }
}