package model;

import modelaccount.Account;

public class Staff extends Person implements Employee {

    private Function function;
    int persNo;

    public Staff() {

    }

    public Staff(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Staff(String firstName, String lastName, Function function) {
        super(firstName, lastName);
        this.function = function;
    }

    public Staff(String firstName, String lastName, int birth, Location residence, Account account, Function function) {
        super(firstName, lastName, birth, residence, account);
        this.function = function;
    }

    @Override
    public String getFunction() {
        return function.toString();
    }

    public void setFunction(Function function) {
        this.function = function;
    }

    @Override
    public void newInput() {
        System.out.println("New Staff");

        System.out.print("Funktion: ");
        function = Function.parseFunction(System.console().readLine());
    }

    public static void newInputDialogue(Staff staff) {
        Person.newInputDialogue(staff);
        System.out.print("Funktion: ");
        staff.function = Function.parseFunction(System.console().readLine());
    }

    @Override
    public String toString() {
        return super.toString() + " Staff [function=" + function + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Staff other = (Staff) obj;
        if (function == null) {
            if (other.function != null)
                return false;
        } else if (!function.equals(other.function))
            return false;
        return true;
    }

    public int getPersNo() {
        return persNo;
    }

    public void setPersNo(int persNo) {
        this.persNo = persNo;
    }

}
