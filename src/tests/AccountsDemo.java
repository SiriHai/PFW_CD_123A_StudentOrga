package tests;

import model.*;
import modelaccount.*;

public class AccountsDemo {
    public static void main(String[] args) throws Exception {

        Account a1 = new SavingsAccount("Nathan Evans");
        Account a2 = new SavingsAccount("Miksu Macloud");
        Account a3 = new SavingsAccount("Ed Sheeran");
        Account a4 = new SavingsAccount("Katy Perry");

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);

        Things<Account> accounts = new Things<Account>(3);
        accounts.add(a1);
        accounts.add(a2);
        accounts.add(a3);
        accounts.add(a4);
        // Account 2 wird gelöscht
        accounts.remove(a2);
        // jetzt wird Account 2 nicht mehr gefunden
        accounts.remove(a2);
        accounts.add(new SavingsAccount("Orlando Bloom"));

        accounts.print();

        accounts.remove("Orlando", "Bloom");
        accounts.remove("Orlando", "Bloom");
        accounts.print();

    }

}
