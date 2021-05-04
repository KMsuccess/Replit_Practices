package Part2_June;
/*
ask the user for his name, capture it on a string using scanner.

then output the length of the name string.
 */
import java.util.Scanner;

public class stringLength {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter your name:");

        String name = s.next();
        int NameLength = name.length();
        System.out.println(NameLength);


    }

}
