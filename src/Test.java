public class Test {

    public static void main(String[] args) {

        // User user = new User("Tomek", 100);
        // User user1 = new User ("Aga", 200);

        // System.out.println(user.getName());
        // System.out.println(user.getAccBalance());

        // TODO 3 to juz nam nie będzie potrzebne, najlepiej zamienić je po prostu na obiekty User
        BankAccount tomek = new BankAccount("Tomek", 4000);
        BankAccount aga = new BankAccount("aga");

        // TODO 5 Jak juz mamy użytkownikow, trzeba ich dodać do listy, więc nalezy stworzyć bank - czytaj todo 6
        tomek.transfer(400, aga);
        //aga.deposit(200);
        //tomek.withdraw(400);
        //aga.deposit(1000);
        System.out.println(tomek.toString());
        System.out.println(aga.toString());

        // TODO 7 Wyczyscic zbędne linijki kodu, dodaj wczesniej stworzonych uzytkowników i uporządkować kod :)

    }


}






