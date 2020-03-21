package day40;

import java.util.Scanner;

public class BankAccount {
    String accountType;
    String accountHolder;
    long accountNumber;
    double balance;
    String password;

    public void showAccountBalance(){
        System.out.println("Current Balance: "+balance);
    }
    public void showAccountHolderInfo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a password for user "+accountHolder+":");
        String pass=scan.nextLine();
        if(password.equals(pass)) {
            System.out.println(accountHolder + " " + "\nAccount number: " + accountNumber +
                    "\nAccount Type: " + accountType);
        }
        else{
            System.out.println("Wrong Password");
        }

    }
    public void withdraw_money(double amount){
        System.out.println("That amount "+amount+" was withdrawn.");
        balance=balance-amount;
    }
    public void deposit(double amount){
        System.out.println("That amount "+amount+" deposited.");
        balance=balance+amount;
    }

}
