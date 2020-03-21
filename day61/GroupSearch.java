package day61;
import java.util.*;
public class GroupSearch {
    public static void main(String[] args) {
        Map<String, List<String> > groupMap = new HashMap<>();

        groupMap.put("PowerOf4" , Arrays.asList("Furkan","Daria","Serife","Muge")  );
        groupMap.put("Achievers" , Arrays.asList("Maiia", "Anastasia", "Zaki", "Toyly", "Like")  );
        groupMap.put("BugHunter" , Arrays.asList("Ayse","Rabiyam","Gulzina")  );
        groupMap.put("BugBusters", Arrays.asList("Rukhshona","Fariza","Seyma","Sumeyyra","Huvayda"));
        for (Map.Entry<String ,List<String>> entry :groupMap.entrySet()){
            if(entry.getValue().contains("Gulzina")){
            System.out.println("Group "+entry.getKey()+" contain Gulzina");}
            else{
                System.out.println("Group "+entry.getKey()+" doesn't contain Gulzina");}
            }
        }
    }
