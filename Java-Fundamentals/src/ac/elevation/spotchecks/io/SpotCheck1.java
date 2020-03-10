package ac.elevation.spotchecks.io;

import java.io.*;

/**
 * @author Yogev Lidor
 * @date 10/03/2020
 */
public class SpotCheck1 {

    private static final String END_LINE = "\n";

    public static void main(String[] args) {
        try (InputStream inputStream = new FileInputStream("c:\\data\\Ingredients.txt")) {
            Reader inputStreamReader = new InputStreamReader(inputStream);

            int data = inputStreamReader.read();
            while (data != -1) {
                char theChar = (char) data;
                data = inputStreamReader.read();
                if (END_LINE.equals(String.valueOf(theChar))) {
                    System.out.println("\n");
                } else {
                    System.out.print(theChar);
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
