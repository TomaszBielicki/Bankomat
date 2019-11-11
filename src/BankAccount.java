import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    String userName;
    double accBalance;
    // TODO 1 dodajemy liste użytkowników, tutaj się troche skomplikuje bo będą to obiekty User a nie BankAccount

    // TODO 6 To juz nie będzie robić za użytkownika, tylko za bank - niech zostanie tylko nazwa np. bankName
    public BankAccount(String userName, double accBalance) {

        this.userName = userName;
        this.accBalance = accBalance;
        // TODO 1.2 pamietaj aby ja zainicjalicować
    }

    public BankAccount(String userName) {

        this.userName = userName;
        this.accBalance = 0;
    }

    // TODO 2 Tutaj będzie metoda aby dodawać użytkowników do listy

    public double deposit(double amounts) {
        if (0 < amounts) {
            this.accBalance += amounts;
        }
        return amounts;
    }

    public void withdraw(double amounts) {
        if (!(accBalance < amounts))
            this.accBalance -= amounts;
        else
            System.out.println("za malo srodkow");
    }


    public void transfer(double amounts, BankAccount acc) {

        if (!(accBalance < amounts)) {
            accBalance -= amounts;
            acc.accBalance += amounts;
            System.out.println("Pieniadze w ilosci " + amounts + " zostaly przelane na konto uzytkownika " + acc);
        } else {
            System.out.println("Za malo srodkow na przelew");
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    @Override
    public String toString() {
        return "name : " + this.userName + "\n" +
                "saldo : " + this.accBalance + "\n\n";
    }
}
