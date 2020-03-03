package ac.elevation.spotchecks.oop2.spotcheck2;

/**
 * @author Yogev Lidor
 * @date 28/02/2020
 */
public class Square extends Shape {

    @Override
    public double getArea(double side) {
        return side * side;
    }

    @Override
    public double getPerimeter(double side) {
        return side * 4;
    }
}
