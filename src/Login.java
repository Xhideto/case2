//Error file reading

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Login extends User{

    private String uname;
    private String pass;
    private String lname;
    private String fname;
    private String phone;
    private String email;

    public void login() {
        Scanner scanner = new Scanner(System.in);
        String username, password;

        int attempts = 0; // Initialize the login attempts counter

        while (attempts < 5) { // Allow a maximum of 5 login attempts
            System.out.println("\t\t-----LOG IN-----");
            System.out.print("Username: ");
            username = scanner.nextLine();
            System.out.print("Password: ");
            password = scanner.nextLine();

            boolean found = false;

            // File input to read the user's information
            try (BufferedReader br = new BufferedReader(new FileReader("UserFiles.txt"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] details = line.split(" ");
                    uname = details[0];
                    pass = details[1];
                    lname = details[2];
                    fname = details[3];
                    phone = details[4];
                    email = details[5];

                    if (username.equals(uname) && password.equals(pass)) {
                        System.out.println("\t\tSuccessfully Login");
                        System.out.println("Name: " + lname + ", " + fname);
                        System.out.println("Phone Number: " + phone);
                        System.out.println("Email Address: " + email);

                        found = true;
                        break;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (found) {
                break; // Successful login, exit the loop
            } else {
                attempts++; // Increment the login attempts counter
                System.out.println("\t\tCheck again your username & password");
                System.out.println("\t\tRemaining attempts: " + (5 - attempts));
            }
        }

        if (attempts == 5) {
            System.out.println("\t\tMaximum login attempts reached. Exiting program.");
            System.exit(0); // Exit the program after 5 failed attempts
        }
    }

    public void display() {
        Login login = new Login();
        login.login();
    }
}
