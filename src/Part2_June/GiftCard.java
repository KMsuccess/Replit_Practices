package Part2_June;
/*
Let's say I've got a 100$ gift card and you want to buy something in your online store .
Write a program that will help me to buy something and display leftover balance after purchase.
If item is not in the list, display message: "Invalid item!".
If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
Hint
Use if/ else if / else
CODE EXAMPLE:
Example #1
input: Hat
output: Thank you for your purchase!
output: Your current balance is: 75$

Example #2
input: Pants
output: Thank you for your purchase!
output: Your current balance is: 50$

Example #3
input: Laptop
output: Sorry, not enough funds on your gift card!

Example #4
input: Cupcake
output: Invalid item!
List of items

 */
import java.util.*;
public class GiftCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        String result = "";
        int card = 100;

/*
        int smartphone = 300;
        int laptop = 400;
        int charger = 15;
        int USBCable = 10;
        int headPhones = 30;
        int pants = 50;
        int hat = 25;
        int socks = 5;
        int blanket= 60;
        int pillow = 40;

 */

        if(word.equalsIgnoreCase("smartphone") || word.equalsIgnoreCase("laptop")){
            result = "Sorry, not enough funds on your gift card!";
        }
        else if (word.equalsIgnoreCase("charger")){
            result = "Thank you for your purchase!\nYour current balance is: " + (card -15)+"$";
        }
        else if (word.equalsIgnoreCase("USB cable")) {
            result = "Thank you for your purchase!\nYour current balance is: " + (card - 10) + "$";
        }
        else if (word.equalsIgnoreCase("headphones")) {
            result = "Thank you for your purchase!\nYour current balance is: " + (card - 30) + "$";
        }
        else if (word.equalsIgnoreCase("pants")) {
            result = "Thank you for your purchase!\nYour current balance is: " + (card - 50) + "$";
        }
        else if (word.equalsIgnoreCase("hat")) {
            result = "Thank you for your purchase!\nYour current balance is: " + (card - 25) + "$";
        }
        else if (word.equalsIgnoreCase("socks")) {
            result = "Thank you for your purchase!\nYour current balance is: " + (card - 5) + "$";
        }
        else if (word.equalsIgnoreCase("blanket")) {
            result = "Thank you for your purchase!\nYour current balance is: " + (card - 60) + "$";
        }
        else if (word.equalsIgnoreCase("pillow")) {
            result = "Thank you for your purchase!\nYour current balance is: " + (card - 40) + "$";
        }else{
            result = "Invalid item!";
        }

        System.out.println(result);


    }
}
