package Part5_July_Methods;

import java.util.Scanner;
/*
Complete a void method printUniqueWords() that will print only unique words from an array of strings.
Every single unique word should be printed from the new line.

Example:
input:[java, code, python, code, rust, code, rust]
output:
java
python
 */
public class Methods15PrintUniqueWords_rep160 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for(int i=0; i < size; i++){
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words){
        //WRITE YOUR CODE HERE

        for(int x = 0; x< words.length;x++){

            boolean uniques = true;
            for(int y = 0; y < words.length;y++){
                if(x!=y && words[x].equals(words[y])){
                    uniques =false;
                    break;
                }
            }
            if(uniques){
                System.out.println(words[x]);
            }

        }



    }
}
