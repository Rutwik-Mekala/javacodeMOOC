import java.util.Scanner;
public class SmallestPair{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sum");
        int sum = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter size of the array");
        int n = Integer.valueOf(scanner.nextLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.valueOf(scanner.nextLine());
        }
        scanner.close();
        System.out.println(getAnswer(sum, arr, n));
    }
    public static int getAnswer(int sum, int[] arr, int n){
        if(n<2 || arr.length==0){
            return -1;
        }
        int temp;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int check = arr[0]+arr[1];
        if(check<sum){
            return arr[0]*arr[1];
        } else{
            return 0;
        }
        
        
    }
}