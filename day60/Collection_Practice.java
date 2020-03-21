package day60;
import java.util.*;
public class Collection_Practice {

       public static void main(String[] args) {
           Map< String,Integer> store = new HashMap<>();
           store.put("Apple",299);
           store.put("Orange",199);
           store.put("Tomato",100);
           store.put("Carrot",50);
           System.out.println("store = " + store);
           System.out.println("Size of the store is: "+store.size());
           System.out.println("Price of the tomato is: "+store.get("Tomato")+"$");
           System.out.println("store.containsKey(\"Orange\") = " + store.containsKey("Orange"));
           System.out.println("before store.get(\"Apple\") = " + store.get("Apple"));
           store.replace("Apple",999);
           System.out.println("after store.get(\"Apple\") = " + store.get("Apple"));
           store.put("Apple",store.get("Apple")*2);
           System.out.println("after store.get(\"Apple\") = " + store.get("Apple"));
           store.put("Carrot",store.get("Carrot")*2);
           System.out.println("after store.get(\"Carrot\") = " + store.get("Carrot"));
          String word = "AAAABBBCCCCCCCCCDDDDEEEEEEEEEEEEEEF";
          Map<Character,Integer> charFreq = new HashMap<>();
          charFreq.put('A',0);
          charFreq.put('B',0);
          charFreq.put('C',0);
          charFreq.put('D',0);
          charFreq.put('E',0);
          charFreq.put('F',0);
           for (int i = 0; i <word.length() ; i++) {
               if(word.charAt(i)=='A'){
                   charFreq.put('A',charFreq.get('A')+1);
               }
               if(word.charAt(i)=='B'){
                   charFreq.put('B',charFreq.get('B')+1);
               }
               if(word.charAt(i)=='C'){
                   charFreq.put('C',charFreq.get('C')+1);
               }
               if(word.charAt(i)=='D'){
                   charFreq.put('D',charFreq.get('D')+1);
               }
               if(word.charAt(i)=='E'){
                   charFreq.put('E',charFreq.get('E')+1);
               }
               if(word.charAt(i)=='F'){
                   charFreq.put('F',charFreq.get('F')+1);
               }
           }
           System.out.println(charFreq);
           List<String> names = new ArrayList<>();
           names.add("Abraham Hope");
           names.add("Zeliha Sezer");
           names.add("Tugba Bekar");
           names.add("Birnigar Ozyurt");
           names.add("Seda Civan");
           names.add("Nuran Demir");
           names.add("Murat Kilinc");
           names.add("Hakan Durmus");
           names.add("Nuran Demir");
           names.add("Mariia Lukianenko");
           Map<String ,Integer> names_ind = new HashMap<>();
           for (int i = 0; i <names.size() ; i++) {
               names_ind.put(names.get(i),i+1);
           }
           System.out.println("Names and indexes: "+names_ind);
       }
}
