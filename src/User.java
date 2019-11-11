public class User {

    private String name;
    private double accBalance;

    public User(String name, double accBalance) {
        this.name = name;
        this.accBalance = accBalance;
    }

    public User(String name){
        this.name = name;
    }
    // TODO 4 pewnie woła o konstruktor z jednym parametrem, to juz znasz ;)

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


}
