package day4;
import java.util.Scanner;
public class mathstuff {
    public static void main(String[] args) {
        while (true) {
            try{
            Scanner myObj = new Scanner(System.in);
            System.out.println("Please provide temp in Fahrenheit:");
            double temp_far = myObj.nextDouble();
            double temp_celc = (5.0 / 9) * (temp_far - 32);
            System.out.println("Temp in Celsius would be: " + temp_celc + " degrees.");}
            catch (Exception e){
                System.out.println("Something unknown happened");
            }
        }
    }
}
