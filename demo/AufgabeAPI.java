package demo;

//import java.util.Random;

public class AufgabeAPI {
    // Aufgabe 3
    static public void zahlRaten() {
        int a = -1, b = -1;
        while (a < 1 || a > 10) {
            System.out.print("Spieler A, rate eine Zahl zwischen 1 und 10: ");
            a = Integer.parseInt(System.console().readLine());
        }
        while (b < 1 || b > 10) {
            System.out.print("Spieler B, rate eine Zahl zwischen 1 und 10: ");
            b = Integer.parseInt(System.console().readLine());
        }

        int randomNumber = (int) (Math.random() * 10 + 1);
        System.out.println(randomNumber);
        //int randomNumber = new Random().nextInt(10) + 1;
        //System.out.println(randomNumber);

        if (Math.abs(a - randomNumber) < Math.abs(b - randomNumber)) {
            System.out.println("A hat gewonnen.");
        } else if (Math.abs(a - randomNumber) > Math.abs(b - randomNumber)) {
            System.out.println("B hat gewonnen.");
        } else {
            System.out.println("unentschieden!");
        }
    }

    // Aufgabe 4
    public static void reverseString(String reVerse) {
        char reverse[] = reVerse.toCharArray();
        int anzahl = reverse.length;

        char ausgabe[] = new char[anzahl];
        for (int i = 0; i < anzahl; i++) {
            ausgabe[i] = reverse[anzahl - i - 1];
        }
        System.out.println("Reverse String: " + new String(ausgabe));
    }

    // Andere Lösungsmöglichkeit:
    public static void reverseString1(String reVerse) {
        System.out.print("Reverse: ");
        for (int i = reVerse.length()-1; i >= 0; i--) {
            System.out.print(reVerse.charAt(i));
        }
        System.out.println();
    }

    // Weitere Lösungsmöglichkeit:
    public static void reverseBufferString(String reVerse) {
        System.out.println("Reverse String: " + new StringBuffer(reVerse).reverse());
    }

    // Aufgabe 5
    public static void cutOutString(String s, char start, char end) {
        int a = s.indexOf(start);
        int b = s.lastIndexOf(end);
        
        // Überprüfung auf richtige Eingabe nicht Aufabenstellung
        if (a == -1 || a > b) { // Falls b im String nicht enthalten ist, ist b = -1
            System.out.println("CutOut nicht möglich");
            return;
        }

        System.out.println(s.substring(a, b + 1));
    }

    public static void main(String[] args) throws Exception {
        while (true) {
            System.out.println("Welche Aufgabe?");
            System.out.println("1: Zahl raten");
            System.out.println("2: Reverse String");
            System.out.println("3: Cut out String");
            System.out.println("N: Programm beenden");
            String antwort = System.console().readLine();
            switch (antwort.toLowerCase()) {
                case "1":
                    zahlRaten();
                    break;
                case "2":
                    System.out.print("Bitte reverseString eingeben: ");
                    String reVerse = System.console().readLine();
                    reverseString(reVerse);
                    reverseString1(reVerse);
                    reverseBufferString(reVerse);
                    break;
                case "3":
                    System.out.print("Bitte CutOutString eingeben: ");
                    String cutOut = System.console().readLine();
                    System.out.print("1. Cut: ");
                    String start = System.console().readLine();
                    System.out.print("2. Cut: ");
                    String end = System.console().readLine();
                    cutOutString(cutOut, start.toCharArray()[0], end.toCharArray()[0]);
                    break;
                case "n":
                    return;

                default:
                    System.out.println("Keine eindeutige Antwort.");
            }
        }
    }
}
