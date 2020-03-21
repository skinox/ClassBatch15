package day9;

import java.util.Scanner;

public class StatementCheck {
    public static void main(String[] args) {
        int i;
        boolean confirm_match = true;
        String[] item = new String[]{"Smartphone", "Laptop", "Charger", "USB cable", "Headphones","Pants","Hat","Socks","Blanket","Pillow"};
        int[] item_price = {300,400,15,10,30,50,25,5,60,40};
        Scanner scan = new Scanner(System.in);
        String item_check = scan.nextLine();
        for (i = 0; i <= 9; i++) {
            if (item_check.equals(item[i]))
            {
                confirm_match = false;
                int diff_price = 100 - item_price[i];
                if (diff_price < 0)
                {
                    System.out.println("Sorry, not enough funds on your gift card!");
                }
                else
                    {
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: " + diff_price + "$");
                    }
            }
            }

        if(confirm_match) {
            System.out.println("Invalid item!");
        }
    }
}
