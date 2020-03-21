package day32;
import java.util.*;
public class Wrapper_practice {
    public static void main(String[] args) {
        Long a = Long.valueOf(23453);
        System.out.println(a.getClass());
        ArrayList<Integer> list1= new ArrayList<>(5);
        int i=1;
        System.out.println(list1.size());
        ArrayList<Integer>list2=new ArrayList<>();
        list1.add(12);
        list1.add(200);
        list1.add(150);
        list1.add(200);
        list1.add(3,22);
        list1.set(0,1000);
        list1.remove(Integer.valueOf(150));
        System.out.println("List one initial is :"+list1);
        list2.add(2344);
        list2.add(777);
        list2.add(2200);
        list2.add(3005);
        list2.add(56);
        list1.addAll(list2);
        System.out.println("List1 is : "+list1);
        int sum=0;
        for (int j = 0; j < list1.size(); j++) {
            sum=sum+list1.get(j);
        }
        System.out.println("Sum for new List1 is :"+sum);

    }
    public static void Test1(String st1){

    }
}
