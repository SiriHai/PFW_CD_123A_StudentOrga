package demo;

public class Isbn1 {

    public static String makeIsbn(int land, int publisher, int bookno) {
        return String.format("%1d%03d%05d", land, publisher, bookno);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, ISBN!");

        String isbn1 = makeIsbn(3, 868, 94111);
        System.out.println(isbn1);

        String isbn2 = makeIsbn(3, 499, 13599);
        System.out.println(isbn2);
    }
}
