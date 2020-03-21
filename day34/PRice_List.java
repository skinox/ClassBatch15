package day34;
import java.util.*;
public class PRice_List {
    public static void main(String[] args) {
        //test your code
        System.out.println( uniqueChars("wooden-spoon") ) ;
    }

    public static String uniqueChars(String str) {
        //TODO: write your below
        String temp = "";
        for (int i = 0; i < str.length(); i++){
            if (temp.indexOf(str.charAt(i)) == - 1){
                temp = temp + str.charAt(i);
            }
        }

        return temp;
    }
}
