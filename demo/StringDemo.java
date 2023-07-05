package demo;
/**
 * Demo-Programm Strings
 * 
 * @author Iris Hanheide
 */

public class StringDemo {
    public static void main(String[] args) throws Exception {
        String s1 = "FHDW";
        String s2 = "FHDW";
        String s1a = new String("FHDW");
        String s2a = new String("FHDW");
        System.out.println(s1 == s2); // true
        System.out.println(s1a == s2a); // false
        System.out.println(s1 == s1a); // false
        System.out.println(s1.equals(s1a)); // true

    }
}
