package day9.Task2;

public class Triangle extends Figure {
    private double length1;
    private double length2;
    private double length3;

    public Triangle(double length1, double length2, double length3, String color) {
        super(color);
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }

    public double getLength1() {
        return length1;
    }

    public double getLength2() {
        return length2;
    }

    public double getLength3() {
        return length3;
    }

    @Override
    public double area() {
        double p = (length1 + length2 + length3) / 2;
        return Math.sqrt(p * (p - length1) * (p - length2) * (p - length3));
    }

    @Override
    public double perimeter() {
        return length1 + length2 + length3;
    }
}
