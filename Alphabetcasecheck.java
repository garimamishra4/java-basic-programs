import java.util.Scanner;

public class Alphabetcasecheck {
    public static void main(String[] args) {

        System.out.println("enter some character");
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        if(ch >= 'a' && ch<='z'){
            System.out.println("entered character is in lower case");
        }
        else {
            System.out.println("entered character is in upper case");

        }
    }
}
