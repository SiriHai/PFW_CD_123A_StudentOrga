package model;

public class Person {
    private String firstName, lastName;
    private int birth;
    // Aufgabe 1
    private String city;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int birth) {
        this(firstName, lastName);
        this.birth = birth;
    }

     public Person(String firstName, String lastName, int birth, String city) {
        this(firstName, lastName, birth);
        this.city = city;
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

    public String getName() {
        return firstName + " " + lastName;
    }

    public void setName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String info() {
        return "firstname: " + firstName + " lastName: " + lastName + " birth: " + birth + " city " + city;
    }

}
