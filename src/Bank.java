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


    public void transfer(String userAcc, double amount, String destAcc) {

        User checkedUser = findUserByName(userAcc);
        User checkedDestUser = findUserByName(destAcc);

//        try {
//            //User checkedUser = findUserByName(userAcc);
//            //User checkedDestUser = findUserByName(destAcc);
//        }catch  (NullPointerException e){
//            System.out.println("Wrong user name");
//            return;
//        }

        if (checkedUser != null && checkedDestUser != null) {

            double checkedUserAcc = checkedUser.getAccBalance();
            double checkedDestAcc = checkedDestUser.getAccBalance();

            checkedUser.setAccBalance(checkedUserAcc -= amount);
            checkedDestUser.setAccBalance(checkedDestAcc += amount);
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
