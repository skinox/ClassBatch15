package day24;
import java.util.*;
public class practice_arr {
    public static void main(String[] args) {
        int inputSecond,hours,minutes,seconds;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter seconds:"); //50000
        inputSecond = scan.nextInt(); //<--- 50000
        hours = inputSecond/3600;
        minutes = (inputSecond%3600)/60;    //    (50000-46800)/60
        seconds = (inputSecond%3600)%60;
        System.out.println(hours+" hours, "+minutes+" minutes, and "+seconds+" seconds");
    }
}
