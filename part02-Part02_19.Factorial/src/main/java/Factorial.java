
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.print("First number?");
        //int first = Integer.valueOf(scanner.nextLine());
        System.out.print("Give a number:");
        int num = Integer.valueOf(scanner.nextLine());
        int fact = 1;

        for(int i = 1; i<= num; i++){
            fact*=i;

        }
        System.out.print("Factorial: "+fact);

    }
}
