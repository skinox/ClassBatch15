package day42;

public class Car {
    String make;
    int year;
    Engine engine_for;

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", year=" + year +
                ", Engine: =" +"type: "+ engine_for.type + " Volume: "+engine_for.volume+" liters"+" Power: "
                +engine_for.power+" HP ";
    }
}
