package day44;

public class Human_Creation {
    public static void main(String[] args) {
        Human h1 = new Human(24,"Aidar","Jumaev");
        System.out.println(h1.toString());
        System.out.println(h1.first_name +" is "+ h1.age+" years old");
        Human h2 = new Human(33,"Mark","Slesarev");
        System.out.println(h2.first_name +" is "+ h2.age+" years old");
        final Human h3 = new Human(25,"Aidar","Djamalbek");
        h3.first_name = "Aidar";
        System.out.println(h3.first_name);
        h3.last_name = "mark";
        final String name = "Aigerim";
        System.out.println("name = " + name);


    }
}
