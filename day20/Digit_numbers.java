package day20;
import java.util.*;
public class Digit_numbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        int last_index = word.length()-1;
        for(int i =0;i<=last_index;i++ ){
            if(word.charAt(i)=='a'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u'){
                System.out.print(word.charAt(i));
            }
        }
    }
}
