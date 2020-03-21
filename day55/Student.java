package day55;

import java.util.Scanner;

public class Student {
    public String name;
    public String last_name;
    public int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student SetValues(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a first name for given Student:");
        this.name = scan.nextLine();
        System.out.println("Please enter a last name for given Student:");
        this.last_name=scan.nextLine();
        System.out.println("Please enter an age for given Student:");
        this.age=scan.nextInt();
        return this;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.SetValues();
        System.out.println(s1);
        Student s2 = new Student();

    }
}
