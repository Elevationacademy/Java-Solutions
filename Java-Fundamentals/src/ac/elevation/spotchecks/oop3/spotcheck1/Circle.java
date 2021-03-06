package ac.elevation.spotchecks.oop3.spotcheck1;

/**
 * @author Yogev Lidor
 * @date 28/02/2020
 */
public class Circle extends Shape {

    static final double PI = 3.14;

    @Override
    public double getArea(double radius) {
        return radius * radius * PI;
    }

    @Override
    public double getPerimeter(double radius) {
        return PI * 2 * radius;
    }
}
