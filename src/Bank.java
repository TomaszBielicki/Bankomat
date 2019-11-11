import java.util.ArrayList;
import java.util.List;

public class Bank {

    String userName;
    double accBalance;
    List<User> users ;
    String bankName;
    // TODO 1 dodajemy liste użytkowników, tutaj się troche skomplikuje bo będą to obiekty User a nie BankAccount

    // TODO 6 To juz nie będzie robić za użytkownika, tylko za bank - niech zostanie tylko nazwa np. bankName
    public Bank(String bankName) {
            this.users = new ArrayList<>();
            this.bankName = bankName;

        // TODO 1.2 pamietaj aby ja zainicjalicować
    }

    // TODO 2 Tutaj będzie metoda aby dodawać użytkowników do listy

    public void addUser(User newUser){
        this.users.add(newUser);

    }

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

    public void transfer(double amounts, Bank acc) {

        if (!(accBalance < amounts)) {
            accBalance -= amounts;
            acc.accBalance += amounts;
            System.out.println("Pieniadze w ilosci " + amounts + " zostaly przelane na konto uzytkownika " + acc);
        } else {
            System.out.println("Za malo srodkow na przelew");
        }
    }

    @Override
    public String toString() {
        return "name : " + this.userName + "\n" +
                "saldo : " + this.accBalance + "\n\n";
    }
}
