package Part3_JulyLoop;
/*
    Online Book Merchants offers premium customers 1 free book with every purchase of 5 or more
    books and offers 2 free books with every purchase of 8 or more books. It offers regular
    customers 1 free book with every purchase of 7 or more books, and offers 2 free books with
    every purchase of 12 or more books.

     Write a program that assigns freeBooks the appropriate value based on the values of the boolean
     variable isPremiumCustomer and the int variable nbooksPurchased.
     Print amount of freeBooks into the console.

 */
import java.util.Scanner;

public class OnlineBookMerchants {
    public static void main(String[] args) {
        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        boolean isPremiumCustomer = scan.nextBoolean();
        int nbooksPurchased = scan.nextInt();

        boolean pr1 = nbooksPurchased >= 5 && nbooksPurchased<8;
        boolean pr2 = nbooksPurchased >= 8 ;

        boolean reg1 = nbooksPurchased >=7 && nbooksPurchased < 12;
        boolean reg2 = nbooksPurchased >= 12;

        if(isPremiumCustomer && pr1){
            System.out.println("amount of freeBooks: 1");
        }
        else if(isPremiumCustomer && pr2){
            System.out.println("amount of freeBooks: 2");
        }
        else if(isPremiumCustomer != true && reg1){
            System.out.println("amount of freeBooks: 1");
        }
        else if(isPremiumCustomer != true  && reg2){
            System.out.println("amount of freeBooks: 2");
        }else{
            System.out.println("amount of freeBooks: 0");
        }



    }
}
