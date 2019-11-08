public class Test {

    public static void main(String[] args) {

        BankAccount tomek = new BankAccount("Tomek", 4000);
        BankAccount aga = new BankAccount("aga");

        tomek.transfer(200, aga);

        System.out.println(tomek.toString());
        System.out.println(aga.toString());
    }
}






