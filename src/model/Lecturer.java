package model;

// Lecturer im Projekt StudentOrg
// @autor Iris Hanheide

public class Lecturer extends Person implements Employee {
    private int persNo;
    
    public Lecturer() {
    }

    public int getPersNo() {
        return persNo;
    }

    public void setPersNo(int persNo) {
        this.persNo = persNo;
    }

    public Lecturer(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Lecturer(String firstName, String lastName, int birth) {
        super(firstName, lastName, birth);
    }

    public Lecturer(String firstName, String lastName, int birth, String city) {
        super(firstName, lastName, birth, city);
    }

    @Override
    public String toString() {
        return super.toString() + " Lecturer []";
    }

    @Override
    protected void newInput() {
        System.out.println("New Lecturer ");
    }

    @Override
    public String getFunction() {
        return "lecturer";
    }

}
