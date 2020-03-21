package day41;

public class Bike {
    int speed;
    int gear;
    String brand;
    public Bike(){
        gear = 1;
        speed =1;
        System.out.println("Message from Constructor "+(5+5));
    }

    public Bike(int speed, int gear, String brand) {
        this.speed = speed;
        this.gear = gear;
        this.brand = brand;
    }
}
