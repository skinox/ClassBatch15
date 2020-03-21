package day55;

public class Calculator {
    int result;
    public Calculator addNum(int num){
        this.result+=num;
        return this;
    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.addNum(34).addNum(23).addNum(99);
        System.out.println(c1.result);
    }

}
