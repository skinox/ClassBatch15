package day43;
public abstract class Animals{
private String name;
private int age;
public int humanYears;

    public void setHumanYears(int humanYears) {
        this.humanYears = humanYears;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public abstract int getAgeInHumanYears();

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


