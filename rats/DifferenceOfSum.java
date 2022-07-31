import java.util.Scanner;
import java.util.ArrayList;

public class DifferenceOfSum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter m: ");
        int m = Integer.valueOf(scanner.nextLine());
        System.out.println(getAnswer(n, m));
        scanner.close();
    }
    public static int getAnswer(int n, int m){
        ArrayList<Integer> list = new ArrayList<>();
        int till = m/n;
        int track = 0;
        int[] arr = new int[till];
        for(int i=1; i<=till; i++){
            arr[track] = n*i;
            track++;
        }
        int sum1 = 0;
        for(int i: arr){
            sum1+= i;
        }
        
        for(int i=1; i<=m; i++){
            if(i%n!=0){
                list.add(i);
            }
        }
        int sum2 = 0;
        for(int i: list){
            sum2+= i;
        }

        return sum2-sum1;
    }
}