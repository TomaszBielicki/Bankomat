public class Test {

    public static void main(String[] args) {

       // User user = new User("Tomek", 100);
       // User user1 = new User ("Aga", 200);

       // System.out.println(user.getName());
       // System.out.println(user.getAccBalance());

        BankAccount tomek = new BankAccount("Tomek", 4000);
        BankAccount aga = new BankAccount("aga");

        tomek.transfer(5000,aga);
        //aga.deposit(200);
        //tomek.withdraw(400);
        //aga.deposit(1000);
        System.out.println(tomek.toString());
        System.out.println(aga.toString());

        }


        }






