
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        
        // statistics.addNumber(3);
        // statistics.addNumber(5);
        // statistics.addNumber(1);
        // statistics.addNumber(2);
        
        // statistics.empty();
        while(true){
            
            System.out.println("Enter numbers: ");
            int num = Integer.valueOf(scanner.nextLine());
            if(num==-1){
                break;
            }
            statistics.addNumber(num);
            if(num%2==0){
                even.addNumber(num);
            } else{
                odd.addNumber(num);
            }
        }
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Average: " + statistics.average());
        System.out.println("Sum: "+statistics.sum());
        System.out.println("Sum of even numbers: "+even.sum());
        System.out.println("Sum of odd numbers: "+ odd.sum());

    }
}
