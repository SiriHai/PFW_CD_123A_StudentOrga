package tests;

import model.Person;

/**
 * Demo-Programm für Person
 * 
 * @author Iris Hanheide
 */

public class PersonTest {

    public static void main(String[] args) throws Exception {

        Person person1 = new Person("Erwin", "Müller");
        System.out.println(person1.info());

        //person1.newInputDialogue();
        System.out.println(person1.info());

        Person person2 = new Person();
        //Person.newInputDialogue(person2);
        System.out.println("\nNeue Person: " + person2.getLastName() + ", " + person2.getFirstName() + " " + person2.getBirth() + "\n");

        Person person3 = new Person("Ed", "Sheeran", 1991, "Halifax");
        System.out.println(person3.info());

        Person person4 = new Person("Ed", "Sheeran", 1991, "Halifax");

        System.out.println(person3 == person4);
        System.out.println(person3.equals(person4));
        System.out.println(person3.toString());
        System.out.println(Integer.toHexString(person3.hashCode()));
    }

}
