package tests;

import model.*;

public class LecturerTest {
    public static void main(String[] args) {

        Lecturer lect1 = new Lecturer("Liese", "Prysselius");
        System.out.println(lect1.info());
        System.out.println(lect1.getName());

        Lecturer lect2 = new Lecturer("Liese", "Prysselius");
        System.out.println(lect2.info());

        Lecturer lect3 = new Lecturer();
        lect3.newInputDialogue();
        System.out.println(lect3.info());

        Lecturer.newInputDialogue(lect3);
        System.out.println(lect3.info());

        Person lect4 = new Lecturer("Volkert", "Stefan", 1972);
        System.out.println(lect4.info());

        Person person4 = new Person("Volkert", "Stefan", 1972);
        System.out.println(person4.info());
    }

}
