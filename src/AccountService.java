import java.util.Scanner;

public class AccountService {

    static Scanner scanner;
    //Scanner scanner = new Scanner(System.in);

    public static void payIn(User user){
        //testowa zmienna

        double x = scanner.nextDouble();


        if ( x != 0 ){

            System.out.println("Wplacono " + x + " zl");
            System.out.println(user.getAccBalance());
        }
        else {
            System.out.println("Musisz wybrac kwote rozna od 0");
        }

    }

    public static void payOut(User user){
        System.out.println("Ile pieniedzy chcesz wyplacic ?");
        double x = 50;
        //tutaj powinien byc balans
        if(x < user.getAccBalance()) {
            user.setAccBalance(+x);
            System.out.println("Wyplacono :" + x + " zl");
            System.out.println(user.getAccBalance());
        }
        else{
            System.out.println("Za malo srodkow");
        }


    }
}
