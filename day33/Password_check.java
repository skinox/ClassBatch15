package day33;

import java.util.*;

public class Password_check {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("The password must be: \n" +
                "-at least eight characters long \n" +
                "-contain an uppercase letter\n" +
                "-contain a special character \n" +
                "-not contain the username\n" +
                "-not be the same as the old password");
        boolean check = true;
        while (check) {
            System.out.println("Enter your username:");
            String username = scan.nextLine();
            System.out.println("Enter your old password:");
            String old_pass = scan.nextLine();
            System.out.println("Enter your new password:");
            String new_pass = scan.nextLine();
            if (new_pass.length() > 7) {
                if (new_pass.matches(".*[A-Z].*")) {
                    if(Special_Char_Check(new_pass)){
                      if(!new_pass.contains(username)){
                          if(!new_pass.equals(old_pass)){
                              System.out.println("Password changed successfully!");
                              check=false;
                          }
                          else{
                              System.out.println("Invalid Password! Try Again");
                          }
                      }
                      else {
                          System.out.println("Invalid Password! Try Again");
                      }
                    }
                    else {
                        System.out.println("Invalid Password! Try Again");
                    }
                }
                else{
                    System.out.println("Invalid Password! Try Again");
                }
            } else {
                System.out.println("Invalid Password! Try Again");
            }
        }

    }
    public static boolean Special_Char_Check(String pass){
        boolean check_2 = false;
        String specialCharacters=" !#$%&'()*+,-./:;<=>?@[]^_`{|}~0123456789";
        String name=pass;
        String str2[]=name.split("");

        for (int i=0;i<str2.length;i++)
        {
            if (specialCharacters.contains(str2[i]))
            {
                check_2=true;
                break;
            }
        }
        return check_2;
    }
}
