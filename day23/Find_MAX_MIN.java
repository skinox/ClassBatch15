package day23;
import java.util.*;
public class Find_MAX_MIN {
    public static void main(String[] args) {
        long[] numbers = new long[5];
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<5;i++){
            numbers[i]=scan.nextInt();
        }
        for(long  x:numbers){
            if(x<100000){
                continue;
            }
            System.out.println(x);
        }
        long max = numbers[0];
        for(int j=0;j<5;j++) {
            if (numbers[j] > max) {
                max = numbers[j];
            }
        }
        System.out.println("Maximum offer is: "+max+"$");
        long min=numbers[0];
        for(int j=0;j<5;j++) {
            if (numbers[j] < min) {
                min = numbers[j];
            }
        }
        System.out.println("Maximum offer is: "+min+ "$");
    }
}
