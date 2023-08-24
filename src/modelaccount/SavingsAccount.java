package modelaccount;

public class SavingsAccount extends Account {
    private static final long FIRST_NO = 2_000_000_000L;
    private static final long LAST_NO = 2_999_999_000L;
    private static long nextNo = FIRST_NO;
    private static long MISTAKE_NO = 2;

    private double transactionLimit; // Verfügungsrahmen
    private float interest; // Zinsen

    // Kontonummer erzeugen
    protected long getNextAccountNo() {
        if (nextNo <= LAST_NO) {
            return nextNo++;
        } else {
            System.out.println("Nummernbereich überschritten");
            return MISTAKE_NO;
        }
    }

    // Konstruktoren
    // Jedes Konto soll mindestens einen Owner und eine Kontonummer haben,
    // deshalb verzichte ich auf den Standardkonstruktor

    public SavingsAccount(String owner) {
        super(owner);
    }

    public SavingsAccount(String owner, double saldo) {
        super(owner, saldo);
    }

    public SavingsAccount(String owner, double saldo, float interest) {
        this(owner, saldo);
        this.interest = interest;
    }

    // Getter und Setter
    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public double getTransactionLimit() {
        return transactionLimit;
    }

    public void setTransactionLimit(double transactionLimit) {
        this.transactionLimit = transactionLimit;
    }

    public static long getNextNo() {
        return nextNo;
    }

    public static void setNextNo(long nextNo) {
        SavingsAccount.nextNo = nextNo;
    }

    // kein equals, Elternmethode wird verwendet
    // einzige vergleichbare Attribute: transactionLimit und interest

    @Override
    public String toString() {
        return super.toString() + " SavingsAccount [transactionLimit=" + transactionLimit + ", interest=" + interest
                + "]";
    }

    // Überschreiben der Methode, da mit Bedingung
    @Override
    public void bookNeg(double amount) {
        if (transactionLimit - amount >= 0 && super.getSaldo() - amount >= 0) {
            super.bookNeg(amount);
            transactionLimit -= amount;
        } else if (transactionLimit - amount < 0) {
            System.out.println("Aktion nicht möglich, restlicher Verfügungsrahmen von " +
                    transactionLimit + " überschritten.");
        } else if (super.getSaldo() - amount < 0) {
            System.out.println("Aktion nicht möglich, Saldo zu niedrig.");
        }
    }

}
