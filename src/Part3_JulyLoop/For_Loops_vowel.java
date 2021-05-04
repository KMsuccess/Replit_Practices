package Part3_JulyLoop;
/*
Instructions from your teacher:
Inputs:
String word;

Write a for loop that will loop through every letter of the input and print out just the vowels. Sample input/outputs
In: howdyho
oo

In: huehuehuehue
ueueueue

In: poopoo what idk what im doing
ooooaiaioi
 */
import java.util.Scanner;

public class For_Loops_vowel {
    public static void main (String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below

        for(int i=0; i<=word.length()-1; i++){

            char W = word.charAt(i);
            String G = W +"";

            if(W == 'a' || W == 'A' || W == 'e' || W == 'E'|| W == 'i' || W == 'I'|| W == 'o'
                    || W == 'O' || W  == 'u'|| W == 'U'){

                System.out.print(W);
            }
        }
    }
}
/*
 if (Character.isLetter(a)) {
           if (vowels.contains(Character.toLowerCase(a))) {
               v++;
           } else {
               c++;
           }
       }
 */