package model;

// Lecturer im Projekt StudentOrg
// @autor Iris Hanheide

public class Lecturer extends Person {
    
    public Lecturer() {
    }

    public Lecturer(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Lecturer(String firstName, String lastName, int birth) {
        super(firstName, lastName, birth);
    }

    public String info() {
        return "Lecturer " + super.info();
    }

}
