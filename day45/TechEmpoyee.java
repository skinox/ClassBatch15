package day45;

public class TechEmpoyee extends Employee {
    @Override
    public String toString() {
        return "TechEmpoyee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
    public void SayHi(){
        System.out.println("Hello!");
    }
    public void calculateAnnualSalary(){
        System.out.println("Annual salary is: "+salary*12);
    }
    public  TechEmpoyee(String name,int id,double salary){
        super(name, id, salary);
    }

    public static void main(String[] args) {
        Employee e1 = new TechEmpoyee("Aidar",23,4699);
        TechEmpoyee e3 = new TechEmpoyee("Mark",13,9000);
        MathEmployee e4 = new MathEmployee("fdsf",32,34);

    }
}
