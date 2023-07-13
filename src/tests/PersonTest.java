package tests;

import model.Person;

/**
 * Demo-Programm für Student
 * 
 * @author Iris Hanheide
 */

public class PersonTest {

    public static void main(String[] args) throws Exception {

        var person1 = new Person();
        person1.newInputDialogue();
        System.out.println("\nNeue Person: " + person1.info());

        System.out.println();
        
        var person2 = new Person();
        person2.newInputDialogue();
        System.out.println("\nNeue Person: " + person2.getLastName() + ", " + person2.getFirstName() + " " + person2.getBirth() + "\n");

    }

}
