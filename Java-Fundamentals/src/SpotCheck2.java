import java.util.ArrayList;
import java.util.List;

/**
 * @author Yogev Lidor
 * @date 11/02/2020
 */
public class SpotCheck2 {

    public static void main(String[] args) {
        spotCheck2();
    }


    public static void spotCheck2() {
        List<Integer> salaries = new ArrayList<>();
        salaries.add(3605);
        salaries.add(5355);
        salaries.add(1664);
        salaries.add(436);
        salaries.add(1916);
        salaries.add(160);
        salaries.add(3738);
        salaries.add(4566);


        int sum = 0;
        for (int salary : salaries) {
            sum = sum + salary;
        }
        int totalAverage = sum / salaries.size();
        System.out.println("Average Salary is: " + totalAverage);

        List<Integer> aboveAverageSalaries = new ArrayList<>();

        int i = 0;
        while (i < salaries.size()) {
            if (salaries.get(i) > totalAverage) {
                aboveAverageSalaries.add(salaries.get(i));
            }
            i++;
        }

        System.out.println(aboveAverageSalaries);
    }
}
