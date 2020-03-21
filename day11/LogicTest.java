package day11;
import java.util.Scanner;
public class LogicTest {
    public static void main(String[] args) {
        boolean check = true;
        System.out.println("enter an username and password to create " +
                "one with a space between");
        Scanner scan = new Scanner(System.in);
        String userName = scan.next();
        String password = scan.next();
        while(check) {
            System.out.println("enter your username and password to " +
                    "login with a space between");
            String usercheck = scan.next();
            String passwordcheck = scan.next();
            if (usercheck.equals(userName) && passwordcheck.equals(password)) {
                System.out.println("you have access");
                check=false;
            } else {
                System.out.println("wrong password or username try again");
            }
        }
    }
}
