package ac.elevation.spotchecks.threading.spotcheck2;

/**
 * @author Yogev Lidor
 * @date 11/03/2020
 */
public class Counter {

    private long count = 0;

    public synchronized void add(long value) {
        this.count += value;
    }

    public long getCount() {
        return count;
    }
}
