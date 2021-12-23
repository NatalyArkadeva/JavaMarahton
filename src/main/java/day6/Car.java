package day6;

import static java.lang.Math.abs;

public class Car {
    private String model;
    private String color;
    private int year;
    private int age;

    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void info(){
        System.out.println("Это автомобиль");
    }
    public int yearDifference(int inputYear){
        age = abs(inputYear - year);
        return age;
    }
}
