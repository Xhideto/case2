import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\t\t Hotel");
            System.out.println("\t\t1. Register");
            System.out.println("\t\t2. Login");
            System.out.println("\t\t3. Exit");
            System.out.print("\t\tEnter your choice: ");
            Scanner scanner = new Scanner(System.in);

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Register");
                    break;
                case 2:
                    System.out.println("Login");
                    break;
                case 3:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        while (choice != 3);
    }
}