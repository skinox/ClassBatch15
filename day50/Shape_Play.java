package day50;

public class Shape_Play {
    public static void main(String[] args) {
        Shape s1 = new Circle(50);
        s1.length=5;
        s1.width=32;
        s1.calculateArea();
        Circle s2 = new Circle(34);
        s2.sayCircle();
        s2.calculateArea();
//        Circle casted_S1 = (Circle) s1;
//        casted_S1.sayCircle();
//        Circle s_new = (Circle) s1;
//        s_new.sayCircle();
//        s_new.calculateArea();
    }
}
