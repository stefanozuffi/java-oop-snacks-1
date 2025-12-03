package org.lessons;

import java.util.ArrayList;

public class RegistroStudenti {
    private ArrayList<Studente> students;

    public RegistroStudenti() {
        this.students = new ArrayList<>();
    } 

    public void addStudent(Studente stud) {
        this.students.add(stud);
    }

    public void printStudents() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getAll());
        }
    }
}
