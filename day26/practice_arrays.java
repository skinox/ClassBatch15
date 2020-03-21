package day26;
import day28.Arrays3D;

import java.util.*;
public class practice_arrays {
    public static void main(String[] args) {
        int[][] matrix = {{22,11,55},{33,66,88},{99,77,11}};
        int sum1=0;
        int sum2=0;
        int total_sum;
        for(int i=0;i<matrix.length;i++){
            sum1+=matrix[i][i];
        }
        for(int i=0;i<matrix.length;i++){
            sum2+=matrix[i][matrix.length-1-i];
        }
        total_sum=sum1-sum2;
        System.out.println(sum1+"\n"+sum2);
        System.out.println(total_sum);
    }
    }

