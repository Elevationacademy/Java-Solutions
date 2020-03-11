package ac.elevation.spotchecks.threading.spotcheck3;

/**
 * @author Yogev Lidor
 * @date 11/03/2020
 */
public class CounterThread extends Thread {

    protected Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 1; i < 6; i++) {
            counter.add(i);
        }
    }
}
