package Part2_June;
/*
You have 2 words, both of them have 3 characters.
If either of them does not have exactly 3 characters, print "cannot merge"
Merge their characters one by one and print together like below:

aok
lol
alookl

ear
pie
epaire

java
wow
cannot merge

hint:
by inserting +""+ (empty string) between chars, you can concatenate char values.
 */
import java.util.Scanner;

public class MergeThem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE


        if (word1.length()== 3 && word2.length() == 3){
            String newWord =word1.charAt(0) +""+ word2.charAt(0)+ word1.charAt(1)+word2.charAt(1) + word1.charAt(2)+
                    word2.charAt(2);
            System.out.println(newWord);

        }else {
            System.out.println("cannot merge");
        }


    }
}
