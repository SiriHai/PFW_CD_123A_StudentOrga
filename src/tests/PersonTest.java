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
        System.out.println(person1);

        // person1.newInputDialogue();
        System.out.println(person1);

        Person person2 = new Person();
        // Person.newInputDialogue(person2);
        System.out.println("\nNeue Person: " + person2.getLastName() + ", " + person2.getFirstName() + " "
                + person2.getBirth() + "\n");

        Person person3 = new Person("Ed", "Sheeran", 1991, "Halifax");
        System.out.println(person3);

        Person person4 = new Person("Ed", "Sheeran", 1991, "Halifax");

        Person person5 = person3;
        System.out.println(person3 == person4); // false
        System.out.println(person3 == person5); // true
        System.out.println(person3.equals(person4)); // false <-
        System.out.println(person5.equals(person3)); // true

        System.out.println(person3);
        System.out.println(person3.toString());
        System.out.println(Integer.toHexString(person3.hashCode()));
    }

}
