package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(2002, "BMW", "White");
        System.out.println(motorbike.getYear() + "\n" + motorbike.getModel() + "\n" + motorbike.getColor());
    }
}