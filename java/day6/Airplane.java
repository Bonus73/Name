package day6;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight, int fuel) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = fuel;
    }

    void fillUp(int n) {
        fuel = n;
    }

    void setYearLenght(int setYear, int setLenght) {
    year = setYear;
    length = setLenght;
    }

    void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + ", вес: "
    + weight + ", количество топлива в баке: " + fuel);
    }

}
