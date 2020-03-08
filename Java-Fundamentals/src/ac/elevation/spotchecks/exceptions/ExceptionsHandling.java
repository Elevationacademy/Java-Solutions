package ac.elevation.spotchecks.exceptions;

/**
 * @author Yogev Lidor
 * @date 14/02/2020
 */
public class ExceptionsHandling {

    private static String[] strings = {"first", "second", "third"};

    public static void main(String[] args) {
        try {
            String str = getFromArray(3);
            System.out.println("String is: " + str);
        } catch (Exception e) {
            System.out.println("Exception message: " + e.getMessage());
        } finally {
            System.out.println("Exiting");
        }
    }

    public static String getFromArray(int index) {
        System.out.println("Getting string from array");
        return strings[index];
    }
}
