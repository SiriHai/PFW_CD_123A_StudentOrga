package model;

public class Staff extends Person {

    private String function;

    public Staff() {

    }

    public Staff(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Staff(String firstName, String lastName, String function) {
        super(firstName, lastName);
        this.function = function;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    @Override
    public void newInputDialogue() {
        super.newInputDialogue();

        System.out.print("Funktion: ");
        function = System.console().readLine();
    }

    public static void newInputDialogue(Staff staff) {
        Person.newInputDialogue(staff);
        System.out.print("Funktion: ");
        staff.function = System.console().readLine();
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

}
