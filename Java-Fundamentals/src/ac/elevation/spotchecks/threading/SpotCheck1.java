package ac.elevation.spotchecks.threading;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Yogev Lidor
 * @date 14/02/2020
 */
public class SpotCheck1 extends Thread {

    public SpotCheck1(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Greetings from " + getName());
    }

    public static void main(String args[]) {
        try (InputStreamReader cin = new InputStreamReader(System.in)) {
            char c;
            c = (char) cin.read();
            runThreads(Character.getNumericValue(c));
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private static void runThreads(int numOfThreads) {
        for (int i = 0; i < numOfThreads; i++) {
            SpotCheck1 t = new SpotCheck1("thread #" + i);
            t.start();
        }
    }
}