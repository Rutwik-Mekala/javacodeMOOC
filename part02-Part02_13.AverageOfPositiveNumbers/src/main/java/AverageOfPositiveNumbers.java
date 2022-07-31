
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        while (true) {

            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            }

            if (num > 0) {
                count++;
                sum += num;
            }
        }
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        }
        if (count != 0) {
            double average = (1.0 * sum) / count;
            System.out.println(average);
        }

    }
}
