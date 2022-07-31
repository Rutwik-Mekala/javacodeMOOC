
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            if(number==9999){
                break;
            }
            list.add(number);
        }
        System.out.println("");

        int smallest = list.get(0);
        
        for(int i=0; i<list.size(); i++){
            int iterate = list.get(i);
            if(smallest>iterate){
                smallest=iterate;
            }
        }
        System.out.println("Smallest number: "+smallest);
        for(int i=0; i<list.size(); i++){
            int indexNumber = list.get(i);
            if(indexNumber==smallest){
                System.out.println(smallest+" is at index "+i);
                
            }
        }

        
    }
}
