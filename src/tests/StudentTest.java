package tests;

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
        student1.setId(1001);

        Student student2 = new Student();
        student2.setName("Miksu Macloud");
        student2.setId(1002);

        System.out.println("Name: " + student1.getName() + " Id: " + student1.getId());
        System.out.println(student2.info());

        // Einlesen von der Konsole,
        Student student3 = new Student();
        // System.out.print("Name: ");
        // String name = System.console().readLine();
        // student3.setName(name);

        // System.out.print("Id: ");
        // int id3 = Integer.parseInt(System.console().readLine());
        // student3.setId(id3);

        student3.setName("Helene", "Fischer");
        student3.setId(1003);
        System.out.println(student3.info());

        // Konstruktor
        Student student4 = new Student("Friday", 1003);
        System.out.println(student4.info());

        System.out.println("Es wurden " + Student.getAnzahl() + " Studenten angelegt.");

    }

}
