import java.util.Scanner;
public class Rats
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input rats");
		
		int rats = Integer.valueOf(scanner.nextLine());
	    System.out.println("Input food per rat");

		int unit = Integer.valueOf(scanner.nextLine());
		System.out.println("Input total houses");

		int num = Integer.valueOf(scanner.nextLine());
		int[] arr = new int[num];
		for(int i=0; i<num; i++){
		    System.out.println("Input food in ith house");
		    arr[i] = Integer.valueOf(scanner.nextLine());
		    
		}
		scanner.close();
		System.out.println(getAnswer(rats,unit,arr));
		
		
	}
	public static int getAnswer(int r, int unit, int[] arr){
	    
	    int total = r*unit;
	    int sum=0;
	    int count = 0;
	    if(arr.length == 0){
	        return -1;
	    }
	    for(int i : arr){
	        sum+=i;
	        count++;
	        if(sum>=total){
	            break;
	        }
	        
	    }
	    if(sum<total){
	        return 0;
	        }
	    return count;
	    
	    
	    
	}
}
