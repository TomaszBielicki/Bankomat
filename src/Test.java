public class Test {

    public static void main(String[] args) {

        User aga = new User("aga");
        User tomek = new User("tomek", 3000);
        User ori = new User("Ori", 100);
        User nymi = new User("Nymka", 200);

        Bank bank = new Bank("bank");

        bank.addUser(aga);
        bank.addUser(tomek);
        bank.addUser(ori);
        bank.addUser(nymi);

        bank.tax();

        // bank.transfer("tomek", 400, "aga");
        bank.showUsers();

        //System.out.println(aga);
    }
}






