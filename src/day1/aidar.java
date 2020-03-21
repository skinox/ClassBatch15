package day1;

import java.util.Scanner;

public class aidar {

        public static void main(String[] args) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("How can I call you?");
            String name = myObj.nextLine();
            System.out.println("Please give the prices of the item:");
            double price = myObj.nextDouble();
            double price1 = myObj.nextDouble();
            double price2 = myObj.nextDouble();
            double price3 = myObj.nextDouble();
            double price4 = myObj.nextDouble();
            double price0= price*1.08875;
            double pr0 = Math.round(price0*1000)/1000.000;
            double price11= price1*1.08875;
            double pr1 = Math.round(price11*1000)/1000.000;
            double price22= price2*1.08875;
            double pr2 = Math.round(price22*1000)/1000.000;
            double price33= price3*1.08875;
            double pr3 = Math.round(price33*1000)/1000.000;
            double price44= price4*1.08875;
            double pr4 = Math.round(price44*1000)/1000.000;
            double priceF = (price+price1+price2+price3+price4)*(1.08875);
            double prF = Math.round(priceF*1000)/1000.000;
            System.out.println("Good Morning "+name+"\n"+"Your final prices and total sum after tax will be: "+"\n"+"item1: "+pr0+"\n"+"item2: "+pr1+"\n"+"item3: "
                    +pr2+"\n"+"item4: "+pr3+"\n"+"item5: "+pr4+"\n"+"Total Sum: "+prF+("$"));

    }
}
