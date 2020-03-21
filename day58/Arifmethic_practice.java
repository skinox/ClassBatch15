package day58;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Arifmethic_practice {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start of Script");
        try {
            checking_throws();
        } catch (FileNotFoundException e) {
            System.out.println("We handled yo yo");        }
        System.out.println("End of script ");
        Thread.sleep(2000);
        System.out.println("Exception will be thrown !!! in 3 sec");
        List<Integer> nums = new ArrayList<>();
        nums.add(23);
        nums.add(11);
        nums.add(11);
        nums.add(11);
        nums.add(11);
        nums.add(71);
        nums.add(56);
        nums.add(81);
        Iterator<Integer> myIter = nums.iterator();
        while (myIter.hasNext()){
            if(myIter.next()==11){
                myIter.remove();
            }
        }
        System.out.println(nums.toString());


    }
    public static void checking_throws() throws FileNotFoundException {
        System.out.println("Yo yo 1");
        throw new FileNotFoundException("Yo yo 2");
    }
}
