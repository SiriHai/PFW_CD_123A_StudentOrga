package modelaccount;

/**
 * Girokonto: abgeleitet von Konto
 * 
 * @author Iris Hanheide
 */

public class CheckingAccount extends Account {
    private static final long FIRST_NO = 1_000_000_000L;
    private static final long LAST_NO = 1_999_999_000L;
    private static long nextNo = FIRST_NO;
    private static long MISTAKE_NO = 1;

    private double overdraftAmount; // Überziehungsrahmen

    // Kontonummer erzeugen
    private void makeNewAccountNo() {
        if (nextNo <= LAST_NO) {
            super.setAccountNo(nextNo++);
        } else {
            System.out.println("Nummernbereich überschritten");
            super.setAccountNo(MISTAKE_NO);
        }
    }

    // Konstruktoren
    // Jedes Konto soll mindestens einen Owner und eine Kontonummer haben,
    // deshalb verzichte ich auf den Standardkonstruktor

    public CheckingAccount(String owner) {
        super(owner);
        makeNewAccountNo();
    }

    public CheckingAccount(String owner, double saldo) {
        super(owner, saldo);
        makeNewAccountNo();
    }

    public CheckingAccount(String owner, double saldo, double overdraftAmount) {
        this(owner, saldo);
        this.overdraftAmount = overdraftAmount;
    }

    // Getter und Setter
    public double getOverdraftAmount() {
        return overdraftAmount;
    }

    public void setOverdraftAmount(double overdraftAmount) {
        this.overdraftAmount = overdraftAmount;
    }

    public static long getNextNo() {
        return nextNo;
    }

    public static void setNextNo(long nextNo) {
        CheckingAccount.nextNo = nextNo;
    }

    // Kein equals, Elternmethode wird verwendet
    // einziges vergleichbares Attribut: overdraftAmount

    @Override
    public String toString() {
        return super.toString() + " CheckingAccount [overdraftAmount=" + overdraftAmount + "]";
    }

    // Überschreiben der Methode, da mit Bedingung
    @Override
    public void bookNeg(double amount) {
        if (super.getSaldo() - amount >= -overdraftAmount) {
            super.bookNeg(amount);
        } else {
            System.out.println("Aktion nicht durchführbar, Dispo von " + overdraftAmount + " überzogen.");
        }
    }

}
