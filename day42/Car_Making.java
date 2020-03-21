package day42;

public class Car_Making {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.make = "Lexus";
        c1.year = 2018;
        Engine en1 = new Engine();
        en1.power = 550;
        en1.type = "V";
        en1.volume = 5.5;
        c1.engine_for = en1;
        System.out.println(c1.toString());
    }
}
