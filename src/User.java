public class User {

    private String name;
    private double accBalance;

    public User(String name, double accBalance) {
        this.name = name;
        this.accBalance = accBalance;
    }

    public User(String name) {
        this.name = name;
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


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    @Override
    public String toString() {
        return "name : " + this.name + "\n" +
                "saldo : " + this.accBalance + "\n\n";
    }
}
