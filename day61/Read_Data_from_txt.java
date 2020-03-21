package day61;
import java.util.*;
import java.io.*;
public class Read_Data_from_txt {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\Jumaev\\Downloads\\EmployeeData.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String str;
        List<  Map<String,String>  > rowMapLst = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Map<String,String > row = new LinkedHashMap<>();
            str = br.readLine();
            String[] split_line = str.split(",");
            row.put("First name",split_line[0]);
            row.put("Email",split_line[1]);
            row.put("Gender",split_line[2]);
            rowMapLst.add(row);
        }
        System.out.println("rowMapLst = " + rowMapLst);
        System.out.println(rowMapLst.get(2).get("First name"));
    }
}
