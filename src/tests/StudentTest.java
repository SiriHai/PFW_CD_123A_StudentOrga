package tests;

import model.Person;
import model.Student;

/**
 * Prüfen der Student-Klasse
 * 
 * @author Iris Hanheide
 */

public class StudentTest {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student();
        // student1.setName("Nathan Evans");
        student1.setName("Nathan", "Evans");
        //student1.setId(1001);

        Student student2 = new Student();
        student2.setName("Miksu", "Macloud");
        //student2.setId(1002);

        System.out.println("Name: " + student1.getName() + " Id: " + student1.getId());
        System.out.println(student2.info());

        Student.setNextId(9999);

        // Einlesen von der Konsole,
        Student student3 = new Student();
        student3.newInputDialogue();
        System.out.println(student3.info());

        Student.newInputDialogue(student3);
        System.out.println(student3.info());

        student3.setName("Helene", "Fischer");
        System.out.println(student3.info());

        // Konstruktor
        Student student4 = new Student();
        student4.setLastName("Friday");
        System.out.println(student4.info());

        Person student5 = new Student("Luciano", "Schmidt");
        System.out.println(((Student)student5).getId());
        System.out.println(student5.info());


        System.out.println("Es wurden " + Student.getAnzahl() + " Studenten angelegt.");

    }

}
