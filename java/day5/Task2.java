package day5;

public class Task2 {
    public static void main(String[] args) {
    Motorbike motorbike1 = new Motorbike(2010,"White", "First");
    motorbike1.getInfo();
    }
}

class Motorbike {
    private int year;
    private String color;
    private String model;

    public  Motorbike() {
    this(1900, "None", "None");
    }

    public Motorbike(int year, String color, String model) {
    this.year = year;
    this.color = color;
    this.model = model;
    }

    public void getInfo() {
        System.out.println(year + ", " + color + ", " + model );
    }
}