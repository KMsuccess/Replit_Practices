package Part3_JulyLoop;

/*
Instructions from your teacher:
Hypertext Markup Language (HTML) is the standard markup language for creating web pages and web applications.
HTML is the language in which most websites are written. HTML is used to create pages and make them functional.

Write a program, that will read html variable and output attribute value of id attribute (tag) into the console.
 Input will be provided in a single line as outlined below. If html variable doesn't contain <html> attribute,
  print out into the console message: "Invalid input!".

Example:
input: <!DOCTYPE html><html><head><title>Java</title></head><body><p id="myid"></p></body></html>
output: myid
 */

import java.util.Scanner;

public class ParseHTML_rep102 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String html = scan.nextLine();


        if(html.contains("<html")){

            int indexOf= html.indexOf("id=");
            int beginningIndex = indexOf +4;
            int lastIndex = html.lastIndexOf("\"");

            System.out.println(html.substring(beginningIndex,lastIndex));

        }else{
            System.out.println("Invalid input!");
        }


    }



}
