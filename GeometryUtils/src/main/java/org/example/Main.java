package org.example;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        boolean isEqual = GeometryUtils.areAreasEqual(circle, rectangle);
        System.out.println("Равны ли площади? " + isEqual);
    }
}
