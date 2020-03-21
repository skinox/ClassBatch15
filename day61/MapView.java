package day61;

import java.util.*;

public class MapView {
    public static void main(String[] args) {
        Map<String ,Double> groceries_shop = new HashMap<>();
        groceries_shop.put("Tomato",5.99);
        groceries_shop.put("Potato",2.99);
        groceries_shop.put("Grape",3.99);
        groceries_shop.put("Banana",1.99);
        groceries_shop.put("Apple",1.89);
        System.out.println("groceries_shop = " + groceries_shop);
        System.out.println("groceries_shop.get(\"Apple\") = " + groceries_shop.get("Apple"));
        Collection<Double> allPrices = groceries_shop.values();
        System.out.println("allPrices = " + allPrices);
        List<Double> allPrices_copy = new ArrayList<>(allPrices);
        allPrices_copy.remove(2.99);
        System.out.println("allPrices = " + allPrices);
        System.out.println("allPrices_copy = " + allPrices_copy);
        Map<String,String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene","Female");
        employeeMap.put("Winfred","Male");
        employeeMap.put("Jereme","Male");
        employeeMap.put("Glad","Female");
        employeeMap.put("Desirae","Female");
        employeeMap.put("Kakalina","Female");
        employeeMap.put("Bertrando","Male");
        employeeMap.put("Ajay","Female");
        employeeMap.put("Brigitte","Female");
        employeeMap.put("Derk","Male");
        employeeMap.put("Orlando","Male");
        employeeMap.put("Selle","Female");
        employeeMap.put("Marika","Female");
        employeeMap.put("Griffy","Male");
        employeeMap.put("Shanon","Female");
        employeeMap.put("Clerkclaude","Male");
        employeeMap.put("Rickard","Male");
        employeeMap.put("Job","Male");
        employeeMap.put("Aida","Female");
        employeeMap.put("Alonzo","Male");
        for (Map.Entry<String,String> entry : employeeMap.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        for(Map.Entry<String,String> entry : employeeMap.entrySet()){
            if(entry.getValue().equals("Male")){
                System.out.println("Male name is: "+entry.getKey());
            }
        }
        for(Map.Entry<String,String> entry: employeeMap.entrySet()){
            if(entry.getValue().equals("Male")){
                entry.setValue("King");
            }
            else{
                entry.setValue("Queen");
            }
        }
        System.out.println("employeeMap.entrySet() = " + employeeMap.entrySet());


    }
}
