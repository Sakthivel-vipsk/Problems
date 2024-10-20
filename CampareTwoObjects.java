package org.JavaArrayPrograms;

class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class CampareTwoObjects {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Sakthi");
        Person person2 = new Person(2, "vel");
        Person person3 = person1;
        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));
    }
}
