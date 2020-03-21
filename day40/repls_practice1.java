package day40;
import com.sun.jdi.IntegerValue;
import java.util.*;
public class repls_practice1 {
    public static void main(String[] args)
    {
    ArrayList<Boolean> arr2 = new ArrayList<>();
    arr2.add(true);
    arr2.add(false);
    arr2.add(true);
        System.out.println(arr2);
    }
    //create your method below
    public static int[] addElements(int[] ints1, int[] ints2) {
     int[] arr= new int[5];
        for (int i = 0; i <4 ; i++) {
            arr[i]=ints1[i]+ints2[i];
        }
        return arr;


    }

}
