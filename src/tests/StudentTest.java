package tests;

import model.Student;

public class StudentTest {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student();
        student1.setName("Nathan Evans");
        student1.setId(1001);

        Student student2 = new Student();
        student2.setName("Miksu Macloud");
        student2.setId(1002);

        System.out.println("Name: " + student1.getName() + " Id: " + student1.getId());
        System.out.println(student2.info());
    }
    
}
