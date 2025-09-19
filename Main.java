import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){


       // java banking system
        // declare variable
        //display menu
        // get and process user choice
        //showBalance(
        //deposit
        //withdraw
        // exit message
        double balance = 34;
        boolean isRunning = true;
        int choice;
        while(isRunning) {
            System.out.println("BANKING SYSTEM ");
            System.out.println("1.balance ");
            System.out.println("2. deposit ");
            System.out.println("3. withdraw ");
            System.out.println("4. exit ");

            System.out.print("enter your choice : ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit();
                case 3 -> balance = balance - withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("invalid choice ");
            }
        }
        System.out.println("thank you have a nice day !");
        scanner.close();
    }
    static void showBalance(double balance){
        System.out.printf("%.2f\n ", balance);
    }
    static double deposit() {
        double amount;
        System.out.println("enter your amount : ");
        amount = scanner.nextDouble();
        if (amount < 0) {
            System.out.println("cannot process this transaction amount in negative ! ");
            return 0;
        } else if (amount > 100000000) {
            System.out.println("amount to big to process !! ");
            return 0;
        } else {
            return amount;
        }

    }
    static double withdraw(double balance){
        double amount;
        System.out.println("enter withdrawal amount : ");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("not enough in account ! ");
            return 0;
        }
        else{
            return amount;
        }
    }



}



        










