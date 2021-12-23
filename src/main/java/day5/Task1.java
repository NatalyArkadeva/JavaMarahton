package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("BMW");
        car.setColor("Black");
        car.setYear(2020);
        System.out.println(car.getModel() + " " + car.getColor() + " " + car.getYear());

    }
}

