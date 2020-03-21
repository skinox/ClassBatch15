package day29;
import java.util.*;
public class Filling_up_array {
    public static void main(String[] args) {
        int max1 = 999;
        int min1 = 100;
        int x = (int) (Math.random() * ((max1 - min1) + 1)) + min1;
        int max2 = 9999999;
        int min2 = 1000000;
        int y = (int) (Math.random() * ((max2 - min2) + 1)) + min2;
        int max3 = 9999999;
        int min3 = 1000000;
        int z = (int) (Math.random() * ((max3 - min3) + 1)) + min3;
//        121-5278961-5007065
        System.out.println(x+"-"+y+"-"+z);
        //BEK-60$*0.84=  50$
        //Saquib-73$*0.84=  61$
        //RAJ-125$*0.84=  105$
        //Aidar - 40$*0.84=  35$
        //TOTAL=298$*0.84=250$
        //Given 250/298=84%
    }
}
