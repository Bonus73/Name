package day5;

public class Task1 {
    public static void main(String[] args) {
    Car car = new Car();
    car.setColor("Green");
    car.setYear(2002);
    car.setModel("Audi");

        System.out.println("Our car " + car.getModel() + " year " + car.getYear() + " color " + car.getColor());
    }
}