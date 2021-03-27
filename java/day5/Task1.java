package day5;

public class Task1 {
    public static void main(String[] args) {
    Car car1 = new Car();
    car1.setYear(2020);
    car1.setColor("Green");
    car1.setModel("Model1");
    System.out.println("Год выпуска автомобиля: " + car1.getYear());
    System.out.println("Цвет автомобиля: " + car1.getColor());
    System.out.println("Модель автомобиля: " + car1.getModel());
    }
}

class Car {
    private int year;
    private String color;
    private String model;

    public void setYear(Integer carYear) {
        if(carYear < 0) {
            System.out.println("Не верный ввод");
        } else {
        year = carYear;}
    }
    public Integer getYear() {
        return year;
    }

    public void setColor(String carColor) {
        if(carColor.isEmpty()){
            System.out.println("Введите цвет");
        } else {
        color = carColor;}
    }
    public String getColor(){
        return color;
    }

    public void setModel(String carModel) {
        if(carModel.isEmpty()){
            System.out.println("Введите название модели");
        } else {
        model = carModel;}
    }
    public String getModel() {
        return model;
    }
}