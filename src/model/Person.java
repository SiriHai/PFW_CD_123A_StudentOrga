package model;

import modelaccount.Account;

public abstract class Person {
    private String firstName, lastName;
    private int birth;
    private Location residence;
    private Account account;

    protected abstract void newInput();

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

    public Person(String firstName, String lastName, int birth, Location residence) {
        this(firstName, lastName, birth);
        this.residence = residence;
    }

    public Person(String firstName, String lastName, int birth, Location residence, Account account) {
        this(firstName, lastName, birth, residence);
        this.account = account;
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

    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Location getResidence() {
        return residence;
    }

    public void setResidence(Location residence) {
        this.residence = residence;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", birth=" + birth + ", Residence=" + residence
                + "\naccount:" + account + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        if (birth != other.birth)
            return false;
        if (residence == null) {
            if (other.residence != null)
                return false;
        } else if (!residence.equals(other.residence))
            return false;
        if (account == null) {
            if (other.account != null)
                return false;
        } else if (!account.equals(other.account))
            return false;
        return true;
    }

}
