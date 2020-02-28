package ac.elevation.spotchecks.oop2.spotcheck2;

/**
 * @author Yogev Lidor
 * @date 28/02/2020
 */
public class Square extends Shape {

    public double getArea(double side) {
        return side * side;
    }

    public double getPerimeter(double side) {
        return side * 4;
    }
}
