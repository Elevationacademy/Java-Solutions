package ac.elevation.spotchecks.oop2.spotcheck1;

/**
 * @author Yogev Lidor
 * @date 25/02/2020
 */
public class Square extends Rectangle {

    public Square(int length) {
        super(length, length);
    }

    @Override
    public int calculatePerimeter() {
        return 4 * getHeight(); // we could also use getWidth() instead since height and width are the same in this case
    }
}
