package day36;

public class Car {
    String made;
    String model;
    String color;
    int year;
    int mileage;
    public void goForward(){
        System.out.println("GO GO GO GO!!");
    }
    public void check_age(){
        System.out.println(made+" "+model+" is "+(2020-year)+" years old.");
    }
}
