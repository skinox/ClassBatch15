package day31;
import java.util.*;
public class Method_practice {
    public static void main(String[] args) {
        array_practice(new int[]{34,5,6,6,7,8,});
        int[]  scores ={4,6,6,7,44,6,8,32,534,6456,3};
        System.out.println();
        array_practice(scores);

    }
    public static void array_practice(int []nums){
        int max =nums[0];
        int min = nums[0];
        int sum =0;
        for (int i = 0; i < nums.length ; i++) {
            sum+=nums[i];
            if(nums[i]>max){
                max=nums[i];
            }
            else if(nums[i]<min){
                min=nums[i];
            }
        }
        System.out.println("Max: "+max+"\n"+"Min: "+min+"\nSum: "+sum);
    }
}
