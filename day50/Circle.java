package day50;
import java.util.*;
public class Circle extends Shape {
    int radius;
public Circle(int radius){
    this.radius = radius;
    }
    @Override
    public void calculateArea() {
        double area = radius*3.14;
        System.out.println("Area of circle is: "+area);
    }
    public void sayCircle(){
        System.out.println("Circle was created!");
    }
}
