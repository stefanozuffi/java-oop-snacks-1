package org.lessons;

public class Snacks {

    public static void main(String[] args) {

        Studente student_1 = new Studente("Franco", "Riva", 21);

        System.out.println(student_1.getAll());

        ContoBancario conto_1 = new ContoBancario(123);
        conto_1.deposit(120);
        conto_1.withdraw(21);
        System.out.println(conto_1.getCensID() + ": $" + conto_1.getSaldo());

        Studente student_2 = new Studente("Christopher", "Pisano", 35);
        RegistroStudenti register = new RegistroStudenti();
        register.addStudent(student_1);
        register.addStudent(student_2);
        register.printStudents();

        RegStudArray registroArr = new RegStudArray();
        registroArr.setRegistro(new Studente[3]);
        registroArr.addStudente(student_1);
        registroArr.addStudente(student_2);

        System.out.println(registroArr.toString());
    }
}