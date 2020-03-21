package day41;

public class ComptuterShop {
    public static void main(String[] args) {
        Computer c1 = new Computer();
        c1.setBrand("Lenovo");
        c1.setRam(32);
        c1.setPrice(1200);
        c1.runProgram();
        c1.calculate();
        System.out.println("c1 = "+c1.toString());

        Computer c2 = new Computer();
        c2.setBrand("Dell");
        c2.setPrice(c1.getPrice()*0.5);
        c2.setRam(8);
        c2.setRam(256);
        c2.runProgram();
        c2.calculate();
        System.out.println("c2 = "+c2.toString());

    }

}
