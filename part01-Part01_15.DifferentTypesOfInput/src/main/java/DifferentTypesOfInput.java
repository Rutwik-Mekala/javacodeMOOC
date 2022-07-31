
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String valstr = scan.nextLine();
        System.out.println("Give an integer:");
        int valint = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double valdouble = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean valbool = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string "+valstr);
        System.out.println("You gave the integer "+valint);
        System.out.println("You gave the double "+valdouble);
        System.out.println("You gave the boolean "+valbool);

    }
}
