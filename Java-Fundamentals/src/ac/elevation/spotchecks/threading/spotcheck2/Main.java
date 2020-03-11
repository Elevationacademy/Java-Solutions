package ac.elevation.spotchecks.threading.spotcheck2;

/**
 * @author Yogev Lidor
 * @date 11/03/2020
 */
public class Main {

    public static void main(String[] args) {
        for (int k = 0; k < 5000; k++) {
            runCounter();
        }
    }

    private static void runCounter() {
        int numberOfThreads = 10;
        int expectedCounterAmount = 150;
        Counter counter = new Counter();

        CounterThread[] workers = new CounterThread[numberOfThreads];
        for (int i = 0; i < numberOfThreads; i++) {
            workers[i] = new CounterThread(counter);
        }

        //start the threads
        for (int i = 0; i < numberOfThreads; i++) {
            workers[i].start();
        }

        /* Wait for all threads to terminate. */

        for (int i = 0; i < numberOfThreads; i++) {
            try {
                workers[i].join();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        // print if value is wrong
        if (counter.getCount() != expectedCounterAmount) {
            System.out.println("Counter value is wrong!!! " + counter.getCount());
        }
    }
}