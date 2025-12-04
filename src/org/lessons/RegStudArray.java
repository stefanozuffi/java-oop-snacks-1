package org.lessons;

public class RegStudArray {
    private Studente[] registro;

    public RegStudArray() {
        this.registro = new Studente[0];
    }

    public Studente[] getRegistro() {
        return this.registro;
    }

    public void setRegistro(Studente[] registro) {
        this.registro = registro;
    }

    public void addStudente(Studente stud) {
        Studente[] updatedReg = new Studente[this.registro.length + 1];

        for (int i=0; i<this.registro.length; i++) {
            updatedReg[i] = this.registro[i];
        }

        updatedReg[this.registro.length] = stud;

        this.registro = updatedReg;

    }

    public String toString() {
        String output = "Register of Students: ";

        for (Studente stud : this.registro) {
            if (stud != null) {
                output += String.format("%s", stud.getAll());
            }
            
        }

        
        
        return output;
    }

}
