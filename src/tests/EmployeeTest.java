package tests;

import model.Employee;
import model.Lecturer;
import model.Staff;

public class EmployeeTest {
    public static void main(String[] args) {
	 
        Lecturer lect1 = new Lecturer("Liese", "Prysellius");
        Lecturer lect2 = new Lecturer("Dr", "Specht");
        Staff staff1 = new Staff("Liese", "Prysellius");
        Staff staff2 = new Staff("David", "Kushner");
        Employee emp1 = new Lecturer("Liese", "Prysellius");
        Employee emp2 = new Staff("Miley", "Cyrus");
        Employee emp3 = lect1;
        Employee emp4 = lect2;
        Employee emp5 = staff1;

        System.out.println(lect1);
        System.out.println(emp3);
        System.out.println(staff1);
        System.out.println(emp5);
        System.out.println(staff2);
         
        emp1.print();
        emp2.print();
        emp3.print();
        emp4.print();
        emp5.print();
        System.out.println(emp1.getFunction());
        System.out.println(((Lecturer)emp1).getName());}
}
