package day50;

public class Shape {
    int length;
    int width;
    public void calculateArea(){
        double area = width*length;
        System.out.println("Shape's area is: "+area);
    }
}
