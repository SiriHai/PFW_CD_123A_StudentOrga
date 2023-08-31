package tests;

import model.Location;
import model.Student;
import model.Students;

public class StudentsDemo {

    public static void main(String[] args) throws Exception {
        Location fhdw1 = new Location("Fürstenallee", 1, 33102, "Paderborn");
        
        Student student1 = new Student("Nathan", "Evans", 1994, fhdw1);
        Student student2 = new Student("Miksu", "Macloud", 1987, fhdw1);
        Student student3 = new Student("Ed", "Sheeran", 1991, fhdw1);
        Student student4 = new Student("Katy", "Perry", 1984, fhdw1);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        
        Students students = new Students(100);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student2);
        students.remove(student2);

        students.add(new Student("Orlando", "Bloom", 1977, fhdw1));
        // students.remove("Orlando", "Bloom");
        students.print();
    }

}
