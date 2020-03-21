package day15;
import java.util.Scanner;
import java.util.*;
import java.time.LocalDate;
public class Testing1 {
    //Write your code here
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean check = true;
        String list_g ="";
        while(check) {
            System.out.println("Please enter guest name:");
            String name = input.nextLine(); //
            System.out.println("Do you want to enter new guest name:");
            String desire = input.nextLine();
            if(desire.equals("no")){
                check=false;
                list_g = list_g+name;
                break;
            }
            list_g = list_g+name+", " ;

        }
        System.out.println("Guest's list: "+list_g);

    }

}