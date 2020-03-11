package ac.elevation.spotchecks.threading.spotcheck2;

/**
 * @author Yogev Lidor
 * @date 11/03/2020
 */
public class Main {

    public static void main(String[] args) {
            Counter counter = new Counter();
            Thread threadA = new CounterThread(counter);
            Thread threadB = new CounterThread(counter);

            threadA.start();
            threadB.start();
    }
}