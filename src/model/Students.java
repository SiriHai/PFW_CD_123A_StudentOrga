package model;

public class Students {
    private Student[] studentArray;
    private int anzahl;

    public Students(int anzahl) {
        studentArray = new Student[anzahl];
        anzahl = 0;
    }

    public void add(Student student) {
        if (student == null) {
            System.out.println("Student is null.");
        } else {
            if (anzahl < studentArray.length)
                studentArray[anzahl++] = student;
            else
                System.out.println("Kein Platz mehr.");
        }
    }

    public void remove(Student student) {
        if (student == null) {
            System.out.println("Student is null.");
        } else {
            for (int i = 0; i < anzahl; i++) {
                if (student.equals(studentArray[i])) {
                    for (int j = i; j < anzahl - 1; j++) {
                        studentArray[j] = studentArray[j + 1];
                    }
                    // --anzahl oder anzahl-- reicht auch
                    studentArray[--anzahl] = null;
                    return;
                }
            }
            System.out.println("Student nicht gefunden.");
        }
    }
    
    public void remove(String firstName, String lastName) {
        for (int i = 0; i < anzahl; i++) {
            if (studentArray[i] != null && 
                studentArray[i].getFirstName().equals(firstName) &&
                studentArray[i].getLastName().equals(lastName)) {
                    remove(studentArray[i]);
                return;
            }
        }
        System.out.println("Student nicht gefunden.");
    }


    // Ausgabe aller gespeicherten Objekte
    public void print() {
        System.out.println("Studenten in students");
        for (int i = 0; i<anzahl; i++) {
            System.out.println(studentArray[i].getName());
        }
    }

}
