package day13;
import java.util.Arrays;
import java.util.Scanner;
public class ReplCommand {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();
        String[] check = new String[]{"A","B","C","D"};
        String[] check_direction = new String[]{"right > ","down > ", "left > ","up > "};
        String[] check_found = new String[]{" A found"," B found"," C found", " D found"};

        for(int i=0;i<4;i++){
            if(start.equals(check[i])){
                if(end.equals(check[i])){
                    System.out.println(" "+check[i]+" found");
                    break;
                }
                for(int j=0;j<4;j++){
                    if(end.equals(check[j])) {
                        int n=0;
                        for (n=0; n < j; n++) {
                            System.out.print(check_direction[n]);
                        }
                        System.out.print(check_found[n]);
                    }
                }

            }
        }
    }
}

//        Example:
//        Input: A
//        Input: D
//        Output: right > down > left: D found