package day9;
import java.util.Scanner;
public class Shopping_repl {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();

        if(item.equals("Charger")){
            int i = 100-15;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+i+"$");
        }
        else if(item.equals("USB cable")){
            int i = 100-10;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+i+"$");
        }
        else if(item.equals("Headphones")){
            int i = 100-30;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+i+"$");
        }
        else if(item.equals("Pants")){
            int i = 100-50;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+i+"$");
        }
        else if(item.equals("Hat")){
            int i = 100-25;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+i+"$");
        }
        else if(item.equals("Socks")){
            int i = 100-5;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+i+"$");
        }
        else if(item.equals("Blanket")){
            int i = 100-60;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+i+"$");
        }
        else if(item.equals("Pillow")){
            int i = 100-40;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+i+"$");
        }
        else if(item.equals("Laptop")||item.equals("Smartphone"))
        {
            System.out.println("Sorry, not enough funds on your gift card!");
        }
        else{
            System.out.println("Invalid item!");
        }

    }
}
