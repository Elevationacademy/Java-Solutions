package ac.elevation.spotchecks.threading.soptcheck2;

/**
 * @author Yogev Lidor
 * @date 14/03/2020
 */
public class SendThread extends Thread {

    private String msg;
    private Sender sender;


    SendThread(String msg, Sender sender) {
        this.msg = msg;
        this.sender = sender;
    }

    public void run() {
        sender.send(msg);
    }
}