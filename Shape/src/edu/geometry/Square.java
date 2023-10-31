package edu.geometry;

public class Square implements Shape {
    private final double length;
    private final double width;

    public Square (double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return getLength() * getWidth();

    }

    public double getLength() {
        return length;
    }


    public double getWidth() {
        return width;
    }

}