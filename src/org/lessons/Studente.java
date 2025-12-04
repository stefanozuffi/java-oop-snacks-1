package org.lessons;

public class Studente {
    private String name;
    private String surname;
    private int age;

    public Studente(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getAll() {
        return this.name + " " + this.surname + ", " + this.age + " years old";
    }
}
