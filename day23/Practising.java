package day23;
import java.util.*;
public class Practising {
    public static void main(String[] args) {
        int[]  nums = new int[7];
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<7;i++){
            nums[i]=scan.nextInt();
        }
        int lastItem = nums[6];
        for(int j=6;j>=0;j--){
            System.out.println(nums[j]);
        }
        System.out.println("Last item: "+lastItem);

        double sum1 = 0;
        for(int x=0;x<7;x++){
            sum1+= nums[x];
        }
        double average = sum1/7;
        System.out.println("Sum: "+sum1);
        System.out.println("Average: "+average);
    }
}
