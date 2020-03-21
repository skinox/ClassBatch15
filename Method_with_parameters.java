import day21.Arrays;

import java.util.*;
public class Method_with_parameters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num){
        //WRITE YOUR CODE HERE
        int[]  arr=new int[30];
        arr[0]=0;
        arr[1]=1;
        for (int i = 2; i <30 ; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(arr[num]);
    }
}
