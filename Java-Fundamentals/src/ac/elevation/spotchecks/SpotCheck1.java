package ac.elevation.spotchecks;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yogev Lidor
 * @date 11/02/2020
 */
public class SpotCheck1 {

    public static void main(String[] args) {
        spotCheck1();
    }

    public static void spotCheck1() {
        List<Integer> investments = new ArrayList<>();
        investments.add(3605);
        investments.add(5355);
        investments.add(1664);
        investments.add(436);
        investments.add(1916);
        investments.add(160);
        investments.add(3738);
        investments.add(4566);

        for (int investment : investments) {
            if (investment > 1800) {
                System.out.println(investment);
            }
        }
    }
}
