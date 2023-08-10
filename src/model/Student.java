package model;

/**
 * Programmaufbau
 * 
 * @author Iris Hanheide
 */

public class Student extends Person {
    private static final int FIRST_ID = 1001;
    private static final int LAST_ID = 9999;

    private static int anzahl;
    private static int nextId = FIRST_ID;

    private int id;
    private String subject;

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Student.nextId = nextId;
    }

    public Student() {
        if (nextId <= LAST_ID)
            id = nextId++;
        else{
            System.out.println("Overflow");
            id = 0;
        }
        anzahl++;
    }

    public Student(String firstName, String lastName) {
        this();
        super.setName(firstName, lastName);
    }

    // Aufgabe 1
    public Student(String firstName, String lastName, int birth, String city) {
        this(firstName, lastName);
        super.setBirth(birth);
        super.setCity(city);
    }

    public Student(String firstName, String lastName, int birth, String city, String subject) {
        this(firstName, lastName, birth, city);
        super.setCity(subject);
    }

    public Student(String firstName, String lastName, int birth, int id) {
        this(firstName, lastName);
        super.setBirth(birth);
        this.id = id;
        anzahl++;
    }

    public static int getAnzahl() {
        return anzahl;
    }

    public static void setAnzahl(int anzahl) {
        Student.anzahl = anzahl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void newInputDialogue(){
        super.newInputDialogue();
        System.out.print("subject: ");
        subject = System.console().readLine();
    }

    // Die Methode wird überladen
    public static void newInputDialogue(Student student){
        Person.newInputDialogue(student);
        System.out.print("subject: ");
        student.subject = System.console().readLine();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (id != other.id)
            return false;
        if (subject == null) {
            if (other.subject != null)
                return false;
        } else if (!subject.equals(other.subject))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + " Student [id=" + id + ", subject=" + subject + "]";
    }



    public static void main(String[] args) throws Exception {
        // wir befinden uns in derselben Datei, deshalb kann für
        // den Zugriff auf Attribute die "Punktnotation" verwendet werden,
        // obwohl die Attribute den Modifizierer "private" haben.
        Student student1 = new Student();
        student1.setName("Nathan", "Evans");
        student1.id = 1001;

        Student student2 = new Student();
        student2.setName("Miksu", "Macloud");
        student2.id = 1002;

        System.out.println("Name: " + student1.getName() + " Id: " + student1.id);
        System.out.println(student2);
    }
}
