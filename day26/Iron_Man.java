package day26;

import java.util.*;

public class Iron_Man {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] inhabitants = new int[8];
            for (int i = 0; i < inhabitants.length; i++) {
                inhabitants[i] = input.nextInt();
            }
            boolean check = true;
            int day=0;
            int count=0;
            while(check){
                for(int i=0;i<inhabitants.length;i++){
                    if(inhabitants[i]!=0){
                        System.out.println("Day "+day+" "+Arrays.toString(inhabitants));
                        for(int j=0;j<inhabitants.length;j++){
                            if(inhabitants[j]==0){
                                continue;
                            }
                            inhabitants[j]/=2;
                            count++;
                        }
                        day++;
                        i=0;

                    }
                    else{
                        check=false;
                    }
                }
            }
            System.out.println("Day "+day+" "+Arrays.toString(inhabitants));
            System.out.println("---- EXTINCT ----");
        System.out.println(count);

        }
    }

//        Day 0 [3, 6, 0, 4, 3, 2, 7, 1]
//        Day 1 [1, 3, 0, 2, 1, 1, 3, 0]
//        Day 2 [0, 1, 0, 1, 0, 0, 1, 0]
//        Day 3 [0, 0, 0, 0, 0, 0, 0, 0]
//        ---- EXTINCT ----