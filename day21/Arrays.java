package day21;
import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String html = scan.nextLine();
        if(html.contains("<html>")){
            int my_id_index=html.indexOf("id=\"")+4;
            String my_id_text = html.substring(my_id_index);
            int my_id_end_index = my_id_text.indexOf("\"");
            String my_id = my_id_text.substring(0,my_id_end_index);
            System.out.println(my_id);
        }
        else{
            System.out.println("Invalid input!");
        }

//                      myid"></p></body></html>
//                                  myid5461654654165jhvgvgvhg"></p></body></html>


    }
}
