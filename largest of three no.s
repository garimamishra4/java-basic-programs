import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter 3 no.s : ");

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if( a>b && b>c ){
            System.out.println("a is largest");
        } else if (b>a && b>c) {
            System.out.println("b is largest");
        }
        else {
            System.out.println("c is largest");
        }

        
    }
}
