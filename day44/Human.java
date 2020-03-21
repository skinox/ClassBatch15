package day44;

public class Human {
    public final int age;
    public String first_name = "FINAL NAME";
    public String last_name;

    public Human(int age,String first_name, String last_name) {
        this.age = age;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                '}';
    }
}
