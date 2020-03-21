package day59;

import java.util.*;
class Job{
    int salary;
    String name;
}

public class Set_Practice {
    public static void main(String[] args) {
        Set<String> states = new HashSet<>(Arrays.asList("NY","FL","AR","TX","TX","DE","IL","IL"));
        Iterator<String> states_iter = states.iterator();
        System.out.println("All states: "+states);

        while (states_iter.hasNext()){
            String each = states_iter.next();
            if(each.equals("NY")){
                states_iter.remove();
            }
        }
        System.out.println("All states after: "+states);
        Set<Integer> nums = new HashSet<>(Arrays.asList(23,3,5,4,4,51,4,7,90,0));
        System.out.println("nums = " + nums);
        
    }
}
