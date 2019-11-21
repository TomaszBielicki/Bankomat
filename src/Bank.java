import java.util.ArrayList;
import java.util.List;

public class Bank {

    // TODO 4 Daj te zmienne jako private tez i usuń accBalance
    String userName;
    double accBalance;
    List<User> users;
    String bankName;

    public Bank(String bankName) {
        this.users = new ArrayList<>();
        this.bankName = bankName;

    }

    public void addUser(User newUser) {
        this.users.add(newUser);

    }

    // TODO 5 Wykorzystamy te metody (deposit, withdraw), ale w klasie User
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


    // TODO 2 Zrob aby destUser tez był Stringiem
    public void transfer(String userAcc, double amount, User destAcc) {

        User checkedUser = findUserByName(userAcc);
        double checkedUserAcc = checkedUser.getAccBalance();
        double destAcc1 = destAcc.getAccBalance();

        // TODO 5.3 zamien logike na wczesniejsze metody
        if (checkedUserAcc > 0) {
            checkedUser.setAccBalance(checkedUserAcc -= amount);
            destAcc.setAccBalance(destAcc1 += amount);
            System.out.println("przelew zrobiony");
        } else {
            System.out.println("Blad");
        }


    }

    // TODO 3 ta metoda bedzie private, tylko Ta klasa (Bank) bedzie z niej kozystać
    public User findUserByName(String name) {

        for (User user : users) {
            if (user.getName().equals(name))
                return user;
        }
        System.out.println("Uzytkownik " + name + " nie istnieje.");
        return null;

    }

    public void showUsers() {
        for (User user : users) {
            System.out.println(user);
        }
    }


}
