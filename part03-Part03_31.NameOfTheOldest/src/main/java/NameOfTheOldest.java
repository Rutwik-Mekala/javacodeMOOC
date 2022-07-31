
import java.util.Scanner;
import java.util.ArrayList;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        int oldest = 0;
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] arr=input.split(",");
            int age = Integer.valueOf(arr[1]);
            String name = arr[0];
            
            if(age>oldest){
                oldest=age;
            }
            names.add(name);
            ages.add(age);
        }
        int foundindex = 0;
        for(int i=0; i<ages.size(); i++){
            int number = Integer.valueOf(ages.get(i));
            if(number==oldest){
                foundindex=i;
            }
        }
        System.out.println("Name of the oldest: "+names.get(foundindex));
        
        

    }
}
