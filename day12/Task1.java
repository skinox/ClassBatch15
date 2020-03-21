package day12;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String str2=sc.next();
            String str1="";
            String num1="";
            int num2=sc.nextInt();
            int num3,num4;
            if (str1.length() < 15) {
                for (int j=0; j<16-str2.length(); j++) {
                    str1 = str2 + " ".repeat(j);
                    if (num2<100) {
                        num3=num2/10;
                        num4=num2%10;
                        num1=0+""+num3+num4;
                    } else {
                        num1=num2+"";
                    }
                }
            }
            System.out.println(str1 + num1);
        }
        System.out.println("================================");

    }
}
