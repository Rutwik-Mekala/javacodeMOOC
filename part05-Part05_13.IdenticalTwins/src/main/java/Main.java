
public class Main {

    public static void main(String[] args) {
        // you can write code here to try out your program
        SimpleDate s1 = new SimpleDate(27, 05, 1999);
        SimpleDate s2 = new SimpleDate(12, 05, 1999);
        Person rutwik = new Person("Rutwik", s1, 180, 100);
        Person jake = new Person("Jake", s2, 180, 120);
        if(rutwik.equals(jake)){
            System.out.println(jake);
        }else{
            System.out.println(rutwik);
        }

        
    }
}
