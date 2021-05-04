package Part2_June;

import java.util.Scanner;
/*
You have a word, do the following:

1. When word has odd number of characters and:
            - 3 or more characters, print middle letter
      oak ==> a
      javav ==> v
             - Single character, print that character 3 times
      # ==> ###
      q ==> qqq

2. When word has even number of characters and:
           - 4 or more characters, print middle 2
     java ==> av
     apples ==> pl
     #$%^&* ==> %^
           - 2 characters, print those 2 characters twice
      @@ ==>@@@@
      $$ ==>$$$$
      hi ==> hihi

 */
public class MiddleOne {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        String word = scan.next();

        int w1 = word.length();



        if(w1 >=3 && w1 % 2 != 0 ) {
            int nw = w1 / 2 ;
            char ch = word.charAt(nw);
            System.out.println(ch);
        }
        if(w1 == 1){

            char ch = word.charAt(0);
            String newWord = ch + "";
            System.out.println( newWord + newWord + newWord );
        }
        if(w1>=4 && w1%2==0){

           char ch1 = word.charAt((word.length()-1)/2);
           char ch2 = word.charAt((word.length()-1)/2+1);
           String newWord1 = ch1+"";
            String newWord2 = ch2+"";
            System.out.println(newWord1+newWord2);
        }
        if(w1 == 2){
            System.out.println(word+word);
        }



    }
}
