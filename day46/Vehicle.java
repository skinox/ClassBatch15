package day46;

public abstract class Vehicle {
    public int year;
    public Vehicle(int year){
        this.year=year;
    }
    public abstract void start();
    public void goForward(){
        System.out.println("Going Forward");
    }
}
