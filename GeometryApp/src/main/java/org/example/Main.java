package org.example;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println("Круг: Площадь = " + circle.getArea() + ", Периметр = " + circle.getPerimeter());
        System.out.println("Прямоугольник: Площадь = " + rectangle.getArea() + ", Периметр = " + rectangle.getPerimeter());
        System.out.println("Треугольник: Площадь = " + triangle.getArea() + ", Периметр = " + triangle.getPerimeter());

        boolean isEqual = GeometryUtils.areAreasEqual(circle, rectangle);
        System.out.println("Равны ли площади круга и прямоугольника? " + isEqual);

        Cube cube = new Cube(3);
        Sphere sphere = new Sphere(5);

        System.out.println("Куб: Объем = " + cube.getVolume() + ", Площадь поверхности = " + cube.getSurfaceArea());
        System.out.println("Сфера: Объем = " + sphere.getVolume() + ", Площадь поверхности = " + sphere.getSurfaceArea());
    }
}
