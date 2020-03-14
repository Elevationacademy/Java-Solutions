package ac.elevation.spotchecks.threading.soptcheck2;

/**
 * @author Yogev Lidor
 * @date 14/03/2020
 */
public class Sender {

    public void send(String msg) {
        System.out.println("Sending " + msg);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Thread " + Thread.currentThread().getName() + " interrupted.");
        }
        System.out.println("Sent " + msg);
    }
}
