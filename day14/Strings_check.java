package day14;
import java.util.Scanner;
public class Strings_check {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Please provide your name:");
        String name_f = scan.nextLine();
        String name = name_f.replaceAll("\\s", "");
        int len_name = name.length();
        System.out.println("Name length is: "+len_name+" symbols.");
        if(len_name<4){
            System.out.println("Short name");
        }
        else if(len_name>=4&&len_name<=11){
            System.out.println("Medium name");
        }
        else{
            System.out.println("Long name");
        }
        if(name.contains("a")||name.contains("A")||name.contains("e")||name.contains("E")){
            System.out.println("Name contains letter \"A\" or \"E\".");
        }
        else{
            System.out.println("Name doesn't contain letter \"A\" or \"E\".");
        }
        System.out.println("Print a name that you want to reverse");
        String name2 = scan.nextLine();
        for(int i=name2.length();i>0;i--){
            System.out.print(name2.charAt(i-1));
        }
        String name3= "Lord of the ring";
        System.out.println(name3.substring(12)+name3.substring(4,12)+"Java "+name3.substring(0,4));
    }
}
