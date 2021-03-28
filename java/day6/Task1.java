package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Black");
        car.setModel("Audi");
        car.setYear(2010);
        Motorbike motorbike = new Motorbike(2010, "BMW", "Blue");
        car.info();
        int yearCar = car.difference();
        System.out.println("Разница: " + yearCar);
        motorbike.info();
        int yearMoto = motorbike.difference();
        System.out.println("Разница: " + yearMoto);
        motorbike.info();
    }
}
