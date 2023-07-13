package tests;

import model.Person;

/**
 * Demo-Programm für Student
 * 
 * @author Iris Hanheide
 */

public class PersonTest {

    public static void main(String[] args) throws Exception {

        Person person1 = new Person("Erwin", "Müller");
        System.out.println(person1.info());

        person1.newInputDialogue();
        System.out.println(person1.info());

        Person person2 = new Person();
        person2.newInputDialogue();
        System.out.println("\nNeue Person: " + person2.getLastName() + ", " + person2.getFirstName() + " " + person2.getBirth() + "\n");

    }

}