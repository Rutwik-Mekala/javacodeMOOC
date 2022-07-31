
public class AdvancedAstrology {

    public static void printStars(int number) {
        int printed = 1;
        while (printed <= number) {
            System.out.print("*");
            printed++;
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        int printed = 1;
        while (printed <= number) {
            System.out.print(" ");
            printed++;
        }
    }

    public static void printTriangle(int size) {
        int printed1 = size;
        int i = 1;
        while (printed1 >= 1) {
            printSpaces(printed1 - 1);
            while (i <= size) {
                printStars(i);
                break;
            }
            printed1--;
            i++;

        }

    }


    public static void christmasTree(int height) {
        int printed1 = height;
        int i = 1;
        int stars = 1;

        while (printed1 >= 1) {
            printSpaces(printed1 - 1);
            while (i <= height) {
                printStars(stars);
                break;
            }

            printed1--;
            i++;
            stars += 2;

        }
        // for (int i = 1; i <= height; i++) {
        // for (int spaces = 1; spaces <= height - i; spaces++) {
        // System.out.print(" ");
        // }
        // for (int stars = 1; stars <= i * 2 - 1; stars++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // }
        printSpaces(height-2);System.out.println("***");
        printSpaces(height-2);System.out.println("***");

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(7);
    }
}


//to print diamond shape
// for(int i=1; i<=4; i++){
//     for(int j=1; j<=4-i; j++){
//         System.out.print(" ");
//     }
//     for(int k=1; k<=i; k++){
//         System.out.print("*");
//     }
//     for(int k=2; k<=i; k++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
// for(int i=1; i<=4; i++){
//     for(int j=2; j<=i; j++){
//         System.out.print(" ");
//     }
//     for(int k=0; k<=4-i; k++){
//         System.out.print("*");
//     }
//     for(int k=1; k<=4-i; k++){
//         System.out.print("*");
//     }
//     System.out.println();

// }
