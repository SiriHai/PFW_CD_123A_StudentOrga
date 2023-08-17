package demo;

public class Isbn1 {

    public static String makeIsbn(int land, int publisher, int bookno) {
        String isbn = String.format("%1d%03d%05d", land, publisher, bookno);
        int psum = pruef(isbn);

        if (psum < 10)
            return isbn + psum;
        else return isbn + "X";  
    }

    private static int pruef(String isbn){
        int zahl = 0;
        for (int i=0; i<9;i++){
            zahl +=Integer.parseInt(isbn.substring(i, i+1)) * (i+1);
        }
        return zahl % 11;
    }    

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, ISBN!");

        String isbn1 = makeIsbn(3, 868, 94111);
        System.out.println(isbn1);

        String isbn2 = makeIsbn(3, 499, 13599);
        System.out.println(isbn2);
    }
}
