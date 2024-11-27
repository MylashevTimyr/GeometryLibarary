package org.example;

public class Main {
    public static void main(String[] args) {
        Cube cube = new Cube(3);
        Sphere sphere = new Sphere(5);

        System.out.println("Куб: Объем = " + cube.getVolume() + ", Площадь поверхности = " + cube.getSurfaceArea());
        System.out.println("Сфера: Объем = " + sphere.getVolume() + ", Площадь поверхности = " + sphere.getSurfaceArea());
    }
}
