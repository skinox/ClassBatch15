package day42;

public class Create_coffee {
    public static void main(String[] args) {
        Coffee c1 = new Coffee("Black Coffee",10,2.99);
        System.out.println("C1's level of caffeine is: "+c1.getCaffeineLevel());
        c1.setCaffeineLevel(25);
        System.out.println("current C1's level of caffeine is: "+c1.getCaffeineLevel());
        Coffee c2 = new Coffee("Cappuccino",5);
        System.out.println(c2.toString());
        Coffee c3 = new Coffee("Mocca",10,6);
        c3.setPrice(-4.55);
        System.out.println("c3 price is: "+c3.getPrice());

    }
}
