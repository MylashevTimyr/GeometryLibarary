package org.example;

public class GeometryUtils {
    public static boolean areAreasEqual(Circle c, Rectangle r) {
        return Math.abs(c.getArea() - r.getArea()) < 0.001;
    }
}
