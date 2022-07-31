
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        int index=0;
        while(index<array.length){
            int count=0;
            int number=array[index];
            while(count<number){
                System.out.print("*");
                count++;
            }
            System.out.println("");
            index++;
        }
    }

}
