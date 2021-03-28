package day6;

public class Task2 {
    public static void main(String[] args) {
    Airplane airplane = new Airplane("Boeing", 2010,10, 15, 0);
    airplane.info();
    airplane.setYearLenght(2012, 12);
    airplane.fillUp(20);
    airplane.info();
    airplane.fillUp(40);
    airplane.info();
    }
}
