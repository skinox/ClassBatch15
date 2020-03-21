package day43;

public class CyberHouse {
    int house_num;
    String design;
    private String neihborhoodName="Bishkek";

    public CyberHouse(int house_num, String design) {
        this.house_num = house_num;
        this.design = design;
    }
    public void ShowAllInfo(){
        System.out.println("house_num = " + house_num+" design : "+design + " neighborhood "+neihborhoodName);
    }

}
