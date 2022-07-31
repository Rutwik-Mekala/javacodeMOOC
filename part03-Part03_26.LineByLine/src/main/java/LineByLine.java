
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
        String input = scanner.nextLine();
        if(input.length()==0){
            break;
        }
        String[] arr = input.split(" ");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    }
}
