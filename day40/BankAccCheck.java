package day40;
import java.io.*;
import java.util.*;
public class BankAccCheck{
        public static void main(String[] args) {
                BankAccount u1 = new BankAccount();
                u1.balance = 70000;
                u1.accountHolder = "Aidar Jumaev";
                u1.accountType = "Checking";
                u1.accountNumber = 777888999;
                u1.password = "1234";
                u1.showAccountBalance();
                u1.deposit(7999);
                u1.showAccountBalance();
                u1.withdraw_money(566);
                u1.showAccountBalance();
                u1.showAccountHolderInfo();
        }
        }

