package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Superjet", 2010, 7000, 5000);
        Airplane airplane2 = new Airplane("Boing", 2018, 64000, 5700);

        Airplane.compareAirplanes(airplane1,airplane2);
    }
}