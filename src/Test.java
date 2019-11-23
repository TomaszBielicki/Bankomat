public class Test {

    public static void main(String[] args) {


        User aga = new User("aga");
        User tomek = new User("tomek", 3000);
        Bank bank = new Bank("bank");


        bank.addUser(aga);
        bank.addUser(tomek);

        // TODO 1 tutaj zabezpieczymy ten przypadek - najlepiej debug i poszukac gdzie wywala
        bank.transfer("tom", 400, "aga");

        bank.showUsers();

        //System.out.println(aga);


    }


}






