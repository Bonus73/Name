package day6;

public class Car {
    private int year;
    private String model;
    private String color;

    int difference() {
        int yearDifference = 2021 - year;
        return yearDifference;
    }

    void setYear(int year) {
        this.year = year;
    }

    void setModel(String model) {
        this.model = model;
    }

    void setColor(String color) {
        this.color = color;
    }

    void info() {
        System.out.println("Это автомобиль");
    }
}