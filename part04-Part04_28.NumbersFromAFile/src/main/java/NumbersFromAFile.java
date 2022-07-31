
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        try(Scanner scan = new Scanner(Paths.get(file))){
            while(scan.hasNextLine()){
                String row = scan.nextLine();
                if(Integer.valueOf(row)>=lowerBound && Integer.valueOf(row)<=upperBound){
                    list.add(row);
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Numbers: "+list.size());
        

    }

}
