package day45;

public class Ball implements Bouncible {
    public void bounce(){
        System.out.println("I'm bouncing");
    }
    String shape;
    String color;
    public Ball(String shape,String color){
        this.shape = shape;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "shape='" + shape + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
