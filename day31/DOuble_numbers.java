package day31;
import java.util.*;
public class DOuble_numbers {
    public static void main(String[] args) {
    int res = build3DigitNumber(2,68,9);
        System.out.println(res);
    }
    public static int build3DigitNumber(int num1,int num2,int num3){
        if(num1>10||num1<0){
            num1=0;
        }
        if(num2>10||num2<0){
            num2=0;
        }
        if(num3>10||num3<0){
            num3=0;
        }
        return num1*100+num2*10+num3;
    }
}
