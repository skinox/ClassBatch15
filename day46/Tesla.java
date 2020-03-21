package day46;

public class Tesla extends Vehicle implements Autonomous {
    public int horsePower;
    public String model;
    public Tesla(int year,int horsePower,String model){
        super(year);
        this.horsePower=horsePower;
        this.model=model;
    }

    @Override
    public void start() {
        System.out.println("Tesla started");
    }

    @Override
    public void selfDrive() {
        System.out.println("Tesla is self-driving ");
    }

    public static void main(String[] args) {
        Autonomous a1 = new Tesla(1996,500,"Model X");
        Tesla a2 = (Tesla) a1;
    }
}
