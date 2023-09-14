package demo_enum;

// Aufgabe 1.1
public enum Jahreszeit {
    FRUEHJAHR("Regen"),
    SOMMER("Sonne"),
    HERBST("Sturm"),
    WINTER("Schnee");

    private String wetter;

    private Jahreszeit(String wetter) {
        this.wetter = wetter;
    }

    public String toString() {
        return wetter;
    }

    // statische Methode, die das zur Jahreszeit zugehörige Wetter ausgibt
    public static void wetterAusgabe(Jahreszeit j) {
        System.out.println(j.name() + ": " + j.wetter);
    }

    // wetterAusgabe(Jahreszeit j) wird überladen 
    // das Wetter aller Jahreszeiten wird in Definitionsreihenfolge ausgegeben
    public static void wetterAusgabe() {
        for (Jahreszeit j : Jahreszeit.values()) {
            wetterAusgabe(j);
        }
    }


    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        System.out.println(FRUEHJAHR);
        wetterAusgabe(FRUEHJAHR);
        wetterAusgabe();
    }
}
