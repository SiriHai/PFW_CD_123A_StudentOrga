package model;

public interface Employee {
    int COST_CENTRE = 1231;

    void setPersNo(int persNo);

    int getPersNo();

    String getFunction();

    default void print() {
        System.out.println("This employee has the function " + getFunction() + ".");
    }

}
