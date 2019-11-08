public class BankAccount {

     String userName;
     double accBalance;



    public BankAccount(String userName, double accBalance) {

        this.userName = userName;
        this.accBalance = accBalance;

    }

    public BankAccount (String userName){

        this.userName = userName;
        this.accBalance = 0;
    }

    public double deposit (double amounts){
        if (0 < amounts) {
            this.accBalance += amounts;
        }
        return amounts;
    }

    public void withdraw (double amounts) {
        if (accBalance < amounts)
            System.out.println("za malo srodkow");
        else
            this.accBalance -= amounts;
    }

    // TODO Platnosc pomiedzy dwoma uzytkwnikami (kluczowy bedzie parametr Bankccount)
    public void transfer (double amounts, BankAccount acc){

        // Todo 1 - czy uzytkownika ma wystarczjąco środków, jeśli nie - wyrzuć info na konsole (sout)
        // Todo 2 - jeśli są środki niech zabierze je z jednego konta i przeleje na drugie
        // Todo 3 - po przelawiu pieniędzy wyświetl informacje o transferze od kogo ile pieniedzy zostalo przelane i na jakie konto

        if(accBalance < amounts) {
            accBalance -= amounts;
        }

        acc.accBalance += amounts;
    }

   public String getUserName (){return userName;}
   public void setUserName(String userName) {
        this.userName = userName;
    }


    public double getAccBalance(){return accBalance;}
    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    @Override
    public String toString() {
        return "name : " + this.userName + "\n" +
                "saldo : " + this.accBalance + "\n\n";
    }
}
