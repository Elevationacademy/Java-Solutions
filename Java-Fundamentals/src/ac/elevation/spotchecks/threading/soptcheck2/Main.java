package ac.elevation.spotchecks.threading.soptcheck2;

/**
 * @author Yogev Lidor
 * @date 14/03/2020
 */
public class Main {
    public static void main(String args[]) {

        Sender sender = new Sender();
        SendThread S1 = new SendThread("You say goodbye", sender);
        SendThread S2 = new SendThread("I say hello", sender);

        S1.start();
        S2.start();

        try {
            S1.join();
            S2.join();
        } catch (Exception e) {
            System.out.println("Interrupted");
        }
        System.out.println("I'm Done!");
    }
}
