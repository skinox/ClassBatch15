package day45;

public class MathEmployee extends Employee {
    @Override
    public String toString() {
        return "MathEmployee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
    public void SayHi(){
        System.out.println("Hello!");
    }
    public void calculateAnnualSalary(){
        System.out.println("Annual salary is: "+salary*12);
    }
    public MathEmployee(String name,int id,double salary){
        super(name, id, salary);
    }

    public static void main(String[] args) {

    }
}
