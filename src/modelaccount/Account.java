package modelaccount;

/**
 * Ü5: Aufgabe 2.1
 * Account: Elternklasse
 * 
 * @author Iris Hanheide
 */

public class Account {
    private static final String COUNTRY_CODE = "DE";
    private static final int COUNTRY = 1314;
    private static final int CODE_NUMBER = 30050110;

    private long accountNo;

    private String iban;
    private String owner;
    private double saldo;

    private static int calcCheckDigit(int country, int codeNumber, long accountNo) {
        int checkDigit = (int) (accountNo % 13);
        return 13 - checkDigit;
    }

    protected void makeIban(String countryCode, int codeNumber, long accountNo) {
        int country = 0;
        if (countryCode.equals("DE"))
            country = COUNTRY;
        
        int pruef = calcCheckDigit(country, codeNumber, accountNo);
        this.iban = String.format("%s%02d%08d%010d",countryCode, pruef, codeNumber, accountNo);

    }

    public static boolean checkIban(String iban) {
        return false;

    }

    // Konstruktoren
    // Jedes Konto soll mindestens einen Owner und eine Kontonummer haben,
    // deshalb verzichte ich auf den Standardkonstruktor von außen
    protected Account() {

    }

    public Account(String owner) {
        this();
        this.owner = owner;
    }

    public Account(String owner, double saldo) {
        this(owner);
        this.saldo = saldo;
    }

    // Getter und Setter
    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
        makeIban(COUNTRY_CODE, CODE_NUMBER, accountNo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Account other = (Account) obj;
        if (accountNo != other.accountNo)
            return false;
        if (iban == null) {
            if (other.iban != null)
                return false;
        } else if (!iban.equals(other.iban))
            return false;
        if (owner == null) {
            if (other.owner != null)
                return false;
        } else if (!owner.equals(other.owner))
            return false;
        if (Double.doubleToLongBits(saldo) != Double.doubleToLongBits(other.saldo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Account [accountNo=" + accountNo + ", iban=" + iban + ", owner=" + owner + ", saldo=" + saldo + "]";
    }

    // Buchungen
    public void book(double amount) {
        saldo += amount;
    }

    public void bookPos(double amount) {
        if (amount > 0)
            book(amount);
        else
            printMistake();
    }

    public void bookNeg(double amount) {
        if (amount >= 0)
            book(-amount);
        else
            printMistake();
    }

    private void printMistake() {
        System.out.println("Mistake: Betrag negativ.");
    }

    // Abfragen über die Konsole
    public void bookPos() {
        System.out.print("Wie viel soll eingezahlt werden? ");
        bookPos(Double.parseDouble(System.console().readLine()));
    }

    public void bookNeg() {
        System.out.print("Wie viel soll abgehoben werden? ");
        bookNeg(Double.parseDouble(System.console().readLine()));
    }

    public static void main(String[] args) {
        Account a1 = new Account("Iris");
        a1.makeIban("DE", CODE_NUMBER,1122334400);
        System.out.println((a1.iban));
    }

}
