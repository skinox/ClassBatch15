package day36;
public class Offer {

    String location;
    String company;
    long salary;
    boolean isFullTime;

    /**
     * This is a instance method to print all the information about Offer object
     * no parameter and no return type
     */
    // inside instance method we can directly access instance variable
    public void displayInformation() {

        System.out.println("Location = " + location + " | " +
                "Company = " + company + " | " +
                "Salary = " + salary + " $ | " +
                "isFullTime = " + isFullTime);

    }
    public void change_Location(String newLocation){

        location = newLocation;
    }
    public void check_100k(){
        if(salary>=100000){
            System.out.println("Offer above belongs to 100K club");
        }
        else{
            System.out.println("Offer above doesn't belong to 100K club");
        }
    }
    public String toString() {

       return "Location = " + location + " , " +
                "Company = " + company + " , " +
                "Salary = " + salary + " $ , " +
                "isFullTime = " + isFullTime;

    }


}