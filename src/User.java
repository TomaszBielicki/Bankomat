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
