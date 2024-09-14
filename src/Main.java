import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = "Guilherme Perondi";
        String accountTypes = "Corrente";
        double balance = 1000.00;
        int option = 0;

        System.out.println("Name: " + name);
        System.out.println("Account type: " + accountTypes);
        System.out.println("Current balance: " + balance);

        String menu = """
                Enter the option
                1 - Check balance
                2 - Transfer
                3 - Receive
                4 - Exit
                """;

        Scanner reading = new Scanner(System.in);

        while (option != 4) {
            System.out.println(menu);
            option = reading.nextInt();

            if (option == 1) {
                System.out.println("Current balance is: " + balance);
            } else if (option == 2) {
                System.out.println("Amount that will be transferred");
                double value = reading.nextDouble();
                if (value > balance) {
                    System.out.println("Operation invalid");
                } else {
                    balance -= value;
                    System.out.println("Current balance: " + balance);
                }
            } else if (option == 3) {
                System.out.println("Amount received: ");
                double value = reading.nextDouble();
                balance += value;
                System.out.println("Current balance: " + balance);
            }else if (option != 4) {
                System.out.println("Operation invalid");
            }
        }
    }
}


