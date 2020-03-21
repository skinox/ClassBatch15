package day10;

import java.util.Scanner;

public class Warm_Up {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Item1, count and its price:");
        String item1 = scan.nextLine();
        int count1 = scan.nextInt();
        double price1 = scan.nextDouble();

        System.out.println("Enter Item2, count and its price:");
        String item2 = scan.next();
        int count2 = scan.nextInt();
        double price2 = scan.nextDouble();

        System.out.println("Enter Item3, count and its price:");
        String item3 = scan.next();
        int count3 = scan.nextInt();
        double price3 = scan.nextDouble();

        double totalPrice = (price1*count1) + (price3*count3);

        double tomatoesPrice = price1 * count1;

        double applesPrice = price3 * count3;

        System.out.println("Item1: Tomatoes Price: "+tomatoesPrice+", "+"Item3: Apples Price: "+applesPrice);

        System.out.println("Total price: "+totalPrice);
    }
}
