
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate date = new SimpleDate(30, 05, 2022);
        date.advance(3);
        SimpleDate newDate = date.afterNumberOfDays(45);
        System.out.println(date);
        System.out.println(newDate);
    }
}
