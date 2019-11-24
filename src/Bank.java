import java.util.ArrayList;
import java.util.List;

public class Bank {


    private String userName;
    private List<User> users;
    private String bankName;

    public Bank(String bankName) {
        this.users = new ArrayList<>();
        this.bankName = bankName;
    }

    public void addUser(User newUser) {
        this.users.add(newUser);
    }


    public void transfer(String userName, double amount, String destUserName) {

        User user = findUserByName(userName);
        User destUser = findUserByName(destUserName);

        if (user != null && destUser != null) {

            double userBalance = user.getAccBalance();
            double destUserBalance = destUser.getAccBalance();

            if (userBalance > amount) {
                user.withdraw(amount);
                destUser.deposit(amount);
            } else {
                System.out.println("brak wystarczajacych srodkow na koncie");
            }

        } else {
            System.out.println("brak uzytkownika o takiej nazwie ");
        }
    }

    private User findUserByName(String name) {

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
