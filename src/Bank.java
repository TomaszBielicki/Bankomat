import java.util.ArrayList;
import java.util.List;

public class Bank {

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


    public void transfer(String userAcc, double amount, User destAcc) {

        User checkedUser = findUserByName(userAcc);
        double checkedUserAcc = checkedUser.getAccBalance();
        double destAcc1 = destAcc.getAccBalance();

        if (checkedUserAcc > 0) {
            checkedUser.setAccBalance(checkedUserAcc -= amount);
            destAcc.setAccBalance(destAcc1 += amount);
            System.out.println("przelew zrobiony");
        } else {
            System.out.println("Blad");
        }


    }

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
