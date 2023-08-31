package tests;

import model.*;

public class LecturerTest implements Locations {
    public static void main(String[] args) {

        Lecturer lect1 = new Lecturer("Liese", "Prysselius");
        System.out.println(lect1);
        System.out.println(lect1.getName());

        Lecturer lect2 = new Lecturer("Liese", "Prysselius");
        System.out.println(lect2);

        System.out.println(lect1.equals(lect2));

        Lecturer lect3 = new Lecturer();
        // lect3.newInputDialogue();
        System.out.println(lect3);

        //Lecturer.newInputDialogue(lect3);
        System.out.println(lect3);

        Person lect4 = new Lecturer("Volkert", "Stefan", 1972, LOC1);
        System.out.println(lect4);
    }

}
