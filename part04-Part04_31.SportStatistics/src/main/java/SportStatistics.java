
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();
        int games = 0;
        int wins = 0;
        int losses = 0;
        try(Scanner scanner = new Scanner(Paths.get(file))){
            while(scanner.hasNextLine()){
                String row = scanner.nextLine();
                String[] arr = row.split(",");
                String home = arr[0];
                String visiting = arr[1];
                int homePoints = Integer.valueOf(arr[2]);;
                int visitingPoints = Integer.valueOf(arr[3]);
                if(home.equals(team)||visiting.equals(team)){
                    games++;
                }
                if(home.equals(team) && homePoints>visitingPoints){
                    wins++;
                }
                if(visiting.equals(team) && visitingPoints>homePoints){
                    wins++;
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Games: "+games);
        System.out.println("Wins: "+wins);
        System.out.println("Losses: "+(games-wins));
    }

}
