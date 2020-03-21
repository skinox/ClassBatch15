package day28;
import java.util.*;
public class Arrays3D {
    public static void main(String[] args) {
        wakeUp();
        start_Zoom();
        for (int i = 0; i < 3; i++) {
            practice_java();
        }
        sayHello(9999);
    }
    public static void sayHello( int x){
        System.out.println("Hello world! "+ (x+1));
        System.out.println("2+2="+(2+2));

    }
    public static void wakeUp(){
        System.out.println("Wake up Aidar!");
        drinkCoffee();
    }
    public static void  drinkCoffee(){
        System.out.println("Brew yourself a coffee");
    }
    public static void start_Zoom(){
        System.out.println("Open and launch Zoom app");
    }
    public static void practice_java(){
        System.out.println("Study java");
    }
}
