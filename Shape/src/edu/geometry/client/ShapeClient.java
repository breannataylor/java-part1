package edu.geometry.client;

import edu.geometry.Square;
import edu.geometry.Circle;
import edu.geometry.Shape;


class ShapeClient {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        shapes[0] = new Circle(4.5);
        shapes[1] = new Circle(3.4);
        shapes[2] = new Square(4,4);


        for (Shape shape : shapes) {
            System.out.printf("The area of the %s is %s\n", shape.getClass().getSimpleName(), shape.area());
        }


    }


}