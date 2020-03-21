package day26;
import java.util.*;
public class Double_arrays {
    public static void main(String[] args) {
        String [][][] Names = {{{"Deon","Jeff","Buster","Peter","Reuben","Antonio","Ariel","Arthur","Ted","Mark"},
                {"Taylor", "Dante","Bennett","Rufus" ,"Terry","Werner" ,"Jed" ,"Woodrow","Dean","Solomon"},
                {"Warner, NH","East Natchitoches, PA","Lyon, WV","Willow Run, IL","Conyersville, AZ","Mount Baker, NY","Farmington Lake, OK","Martins Corner, TX","Pickerel Narrows, MT","Willaha, OH"}},{
            {"Denis","Dmitry", "Dobrushin","Dorofey","Eduard","Erik","Evgeniy","Evgeny","Faddei","Fanasiy"},{"Shalyapin","Nikolayev","Noskov","Nosov","Shaposhnikov","Sharapov","Tamarkin","Tarasov","Tereshchenko","Timofeyev"},
                {"Urochishche Dashkino", "Ivanoryad","Rauschnick","Pleshkovo","Sokolovo","Okhotino","Eminkhyur","Staromusino","Titovskaya", "Pashkovo"}}
        };
        boolean check = true;
        while(check) {
            Scanner scan1= new Scanner(System.in);
            System.out.println("Select 1 if you want USA based names or Select 2 for Russian based names:");
            int choice = scan1.nextInt();
            if(choice==1) {
                int max1 = 9;
                int min1 = 0;
                int y = (int) (Math.random() * ((max1 - min1) + 1)) + min1;
                int max2 = 9;
                int min2 = 0;
                int x = (int) (Math.random() * ((max2 - min2) + 1)) + min2;
                int max3 = 9;
                int min3 = 0;
                int z = (int) (Math.random() * ((max3 - min3) + 1)) + min3;
                int age_max = 80;
                int age_min = 4;
                int age = (int) (Math.random() * ((age_max - age_min) + 1)) + age_min;


                System.out.println("Name of the person is " + Names[0][0][y] + " " + Names[0][1][x] + " and his age is " + age + ", and his is from " + Names[0][2][z]);
                Scanner scan = new Scanner(System.in);
                System.out.println("Do you want to continue to generate random names?: ");
                String answer = scan.nextLine();
                if (answer.equals("n")) {
                    check = false;
                }
            }
            else if(choice==2){
                int max1 = 9;
                int min1 = 0;
                int y = (int) (Math.random() * ((max1 - min1) + 1)) + min1;
                int max2 = 9;
                int min2 = 0;
                int x = (int) (Math.random() * ((max2 - min2) + 1)) + min2;
                int max3 = 9;
                int min3 = 0;
                int z = (int) (Math.random() * ((max3 - min3) + 1)) + min3;
                int age_max = 80;
                int age_min = 4;
                int age = (int) (Math.random() * ((age_max - age_min) + 1)) + age_min;


                System.out.println("Name of the person is " + Names[1][0][y] + " " + Names[1][1][x] + " and his age is " + age + ", and his is from " + Names[1][2][z]);
                Scanner scan = new Scanner(System.in);
                System.out.println("Do you want to continue to generate random names?: ");
                String answer = scan.nextLine();
                if (answer.equals("n")) {
                    check = false;
                }
            }
        }
    }
}
