package day6;

public class Motorbike {
    private int year;
    private String model;
    private String color;

    int difference() {
        int yearDifference = 2021 - year;
        return yearDifference;
    }

    public Motorbike(int year, String model, String color) {
        this.year = year;
        this.model = model;
        this.color = color;
    }

    void info() {
        System.out.println("Это мотоцикл");
    }
}
