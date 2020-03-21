package day25;
import java.util.*;
public class Char_Array {
    public static void main(String[] args) {
        String survey = "Complete B15 Online 1 Month Survey" ;
        char[] surveyChars = survey.toCharArray();
        // how did determine to use char for each?
        //because ech item in char array is char
        for (char each: surveyChars)
        {
            System.out.println("each char is : " + each);
        }
        // just for fun why dont we try while loop

        int x =0;
        while ( x<surveyChars.length){
            System.out.println("each char is : "+surveyChars[x]);
            x++ ;
        }
    }
}
