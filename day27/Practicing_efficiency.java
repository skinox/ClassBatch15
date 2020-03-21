package day27;
import java.util.*;
public class Practicing_efficiency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }
        int day=0;
        int count=0;
        int[] check=new int[]{0,0,0,0,0,0,0,0};
        do{
            System.out.println("Day "+(day++)+" "+ Arrays.toString(inhabitants));
            for(int i=0;i<inhabitants.length;i++){
                if(inhabitants[i]==0){
                    continue;
                }
                else{
                    inhabitants[i]/=2;
                    count++;
                }
            }
        }while(!Arrays.equals(inhabitants,check));
        System.out.println("Day "+(day++)+" "+ Arrays.toString(inhabitants));
        System.out.println("---- EXTINCT ----");
        System.out.println(count);
    }
}
