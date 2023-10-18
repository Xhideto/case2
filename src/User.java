import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
    private String lname;
    private String fname;
    private String uname;
    private String phone;
    private String email;
    private String pass;

    public User() {
    }

    public User(String lname, String fname, String uname, String phone, String email, String pass) {
        this.lname = lname;
        this.fname = fname;
        this.uname = uname;
        this.phone = phone;
        this.email = email;
        this.pass = pass;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void display() {
        List<User> users = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Last Name: ");
        String lname = sc.nextLine();

        System.out.print("First Name: ");
        String fname = sc.nextLine();

        System.out.print("Username: ");
        String uname = sc.nextLine();

        System.out.print("Phone Number: ");
        String phone = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Password: ");
        String pass = sc.nextLine();

        User user = new User(lname, fname, uname, phone, email, pass);
        users.add(user);

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("users.txt", true));
            bw.write(user.getLname() + ", " + user.getFname() + ", " + user.getUname() + ", " + user.getPhone() + ", " + user.getEmail() + ", " + user.getPass());
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Registered");
    }
}
