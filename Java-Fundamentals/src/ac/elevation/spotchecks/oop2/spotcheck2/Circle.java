package ac.elevation.spotchecks.oop2.spotcheck2;

/**
 * @author Yogev Lidor
 * @date 28/02/2020
 */
public class Circle extends Shape {

    static final double PI = 3.14;

    public double getArea(double radius) {
        return radius * radius * PI;
    }

    public double getPerimeter(double radius) {
        return PI * 2 * radius;
    }
}
