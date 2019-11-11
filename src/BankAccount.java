public class BankAccount {

    String userName;
    double accBalance;


    public BankAccount(String userName, double accBalance) {

        this.userName = userName;
        this.accBalance = accBalance;

    }

    public BankAccount(String userName) {

        this.userName = userName;
        this.accBalance = 0;
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

    // TODO Platnosc pomiedzy dwoma uzytkwnikami (kluczowy bedzie parametr Bankccount)
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
