package day56;

import java.util.ArrayList;
import java.util.List;

public class Product_compare {
    public static void main(String[] args) {
        Product p1 = new Product("Iphone",750);
        Product p2 = new Product("Iphone",70);
        System.out.println(p1.equals(p2));
        List<Product> products_list = new ArrayList<Product>();
        products_list.add(new Product("MacBook",1999));
        System.out.println();
        Product[] ProArray = new Product[20];
        ProArray[0]=new Product("Giant ",99999);
        System.out.println(ProArray[0].equals(products_list.get(0)));
        Product mac = new Product("MacBook",1999);
        boolean result = products_list.contains(mac );
        System.out.println(result);

    }
}
