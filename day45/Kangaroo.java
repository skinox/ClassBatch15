package day45;

public class Kangaroo implements Bouncible {
   public String name;
   public double jump_distance;
   public Kangaroo(String name, double jump_distance){
       this.name = name;
       this.jump_distance = jump_distance;
   }
    @Override
    public void bounce() {
        System.out.println("I'm a Kangaroo");
    }

    @Override
    public String toString() {
        return "Kangaroo{" +
                "name='" + name + '\'' +
                ", jump_distance=" + jump_distance +
                "  meters and gravity is:"+gravity+ "m/sec^2}";
    }

    public static void main(String[] args) {
        Bouncible b1 = new Ball("Round","Red");
        System.out.println(b1.toString());
        Kangaroo k1 = new Kangaroo("Yety",24.5);
        System.out.println(k1.toString());
    }
}
