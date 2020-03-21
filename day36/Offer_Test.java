package day36;

import java.util.ArrayList;
import java.util.List;

public class Offer_Test {
    public static void main(String[] args) {
        Offer of1 = new Offer();
        of1.company = "Apple";
        of1.isFullTime = true;
        of1.location = "Pal Alto";
        of1.salary = 117000;

        Offer of2 = new Offer();
        of2.company = "Google";
        of2.isFullTime = false;
        of2.location = "New York";
        of2.salary = 97500;

        Offer of3 = new Offer();
        of3.company = "Amazon";
        of3.location  = "Washington DC";
        of3.isFullTime = true;
        of3.salary = 144000;

        List<Offer> my_offer_list = new ArrayList<>();
        my_offer_list.add(of1);
        my_offer_list.add(of2);
        my_offer_list.add(of3);

        List<String> new_Locations = new ArrayList<>();
        new_Locations.add("Bishkek");
        new_Locations.add("Hamburg");
        new_Locations.add("Dubai");


        for (int i = 0; i <3 ; i++) {
            my_offer_list.get(i).displayInformation();
        }
        System.out.println("Same info with new locations: ");
        for (int i = 0; i <3 ; i++) {
            my_offer_list.get(i).change_Location(new_Locations.get(i));
            my_offer_list.get(i).displayInformation();
            my_offer_list.get(i).check_100k();

        }

        System.out.println();
        System.out.println("Same info in specific format: ");
        for (int i = 0; i <3 ; i++) {
            System.out.println(my_offer_list.get(i));
        }

    }
}
