package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike bike = new Motorbike("Honda", "yellow", 2005);
        System.out.println(bike.getModel() + " " + bike.getColor() + " " + bike.getYear());
    }
}
