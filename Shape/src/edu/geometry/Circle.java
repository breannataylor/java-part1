package edu.geometry;

public class Circle implements Shape {
    double radius;

    public Circle (double radius){
        setRadius(radius);
    }

    @Override
    public double area() {
        return (radius * radius) * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
