package ac.elevation.spotchecks.oop2.spotcheck1;

/**
 * @author Yogev Lidor
 * @date 25/02/2020
 */
public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int calculateArea() {
        return width * height;
    }

    public int calculatePerimeter() {
        return (2 * width) + (2 * height);
    }


    //Getters //

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
