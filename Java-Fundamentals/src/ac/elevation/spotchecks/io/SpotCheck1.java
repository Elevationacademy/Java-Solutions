package ac.elevation.spotchecks.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Yogev Lidor
 * @date 10/03/2020
 */
public class SpotCheck1 {

    public static void main(String[] args) {
        try (FileInputStream fn = new FileInputStream("c:\\data\\yogibear.jfif");
             FileOutputStream fo = new FileOutputStream("c:\\data\\copied-image.jfif")) {
            int k;
            while ((k = fn.read()) != -1) {
                fo.write((byte) k);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
