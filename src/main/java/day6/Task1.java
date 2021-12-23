package day6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("BMW");
        car.setColor("Black");
        car.setYear(2020);
        car.info();
        Scanner scanner = new Scanner(System.in);
        int inputYear = scanner.nextInt();
        System.out.println(car.yearDifference(inputYear));

        Motorbike bike = new Motorbike("Honda", "yellow", 2005);
        bike.info();
        int inputYear1 = scanner.nextInt();
        System.out.println(bike.yearDifference(inputYear1));
    }
}
