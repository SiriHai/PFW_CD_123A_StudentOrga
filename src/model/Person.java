package model;

public class Person {
    private String firstName, lastName;
    private int birth;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int geburtsjahr) {
        this(firstName, lastName);
        this.birth = geburtsjahr;
    }

    // neue Methode Aufgabe 1
    public void newInputDialogue() {
        System.out.print("lastname: ");
        lastName = System.console().readLine();
        System.out.print("firstname: ");
        firstName = System.console().readLine();
        System.out.print("birth: ");
        birth = Integer.parseInt(System.console().readLine());
    }

    // statische Methode
    public static void newInputDialogue(Person person) {
        System.out.print("lastname: ");
        person.lastName = System.console().readLine();
        System.out.print("firstname: ");
        person.firstName = System.console().readLine();
        System.out.print("birth: ");
        person.birth = Integer.parseInt(System.console().readLine());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public String info() {
        return "firstname: " + firstName + " lastName: " + lastName + " birth: " + birth;
    }

}
