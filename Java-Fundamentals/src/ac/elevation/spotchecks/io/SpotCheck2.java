package ac.elevation.spotchecks.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Yogev Lidor
 * @date 10/03/2020
 */
public class SpotCheck2 {

    public static void main(String[] args) {
        List<String> namesAndPhones = new ArrayList<>();
        namesAndPhones.add("Ela" + ":" + "054303020");
        namesAndPhones.add("Yael" + ":" + "052020587");
        namesAndPhones.add("Natan" + ":" + "056892487");
        namesAndPhones.add("Gali" + ":" + "053629628");

        try (FileOutputStream fos = new FileOutputStream("c:\\data\\output.txt");
             OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fos)) {
            for (String entry : namesAndPhones) {
                outputStreamWriter.write(entry + "\n");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
