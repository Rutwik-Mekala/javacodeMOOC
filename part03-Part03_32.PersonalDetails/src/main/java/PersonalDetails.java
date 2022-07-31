
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int longest = 0;
        String longestName = " ";
        int count=0;
        ArrayList<Integer> birthYears = new ArrayList<>();
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] arr = input.split(",");
            String name = arr[0];
            int year = Integer.valueOf(arr[1]);
            if(name.length()>longest){
                longest=name.length();
                longestName=name;
            }
            // System.out.println("tracking the longest name"+longestName);
            birthYears.add(year);
            count++;
        }
        int sum=0;
        for(int year: birthYears){
            sum+=year;
        }
        double average = 1.0*sum/count;
        System.out.println("Longest name: "+longestName);
        System.out.println("Average of the birth years: "+average);

    }
}
