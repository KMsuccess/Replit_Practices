package Part4_julyArraysLoop;
/*
Write your code inside the method.
Use the values given as method parameters.
Assign final values.
Then user should select service quality that will correspond to tip percent.
Poor = 5%
Fair = 10%
Good = 15%
Great = 20%
Excellent = 25%
The program should display the following information based on the user input:
Split or No split
Number of people entered: &&&&
Service Quality:
Total to pay:
Total tip:
Total per person:
Tip per person:
https://itunes.apple.com/us/app/ihandy-tip-calculator/id324501526?mt=8

Input:
Split:Yes
Number of people:4
Check amount:476.0
Service Quality:Excellent

Output:
Number of people entered: &&&&
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75
 */

import java.util.*;


public class TipCalculator {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        Scanner scan = new Scanner(System.in);

        String quality;
        int numOfPeople;
        double totalToPay = 0, totalTip= 0, totalPerPerson= 0, tipPeerPerson= 0;

        System.out.println("Split:");
        String SplitOrNot = scan.next();

        if(SplitOrNot.equalsIgnoreCase("yes")){

            System.out.println("Number of people:");
            numOfPeople= scan.nextInt();


            System.out.println("Check amount:");
            totalToPay = scan.nextDouble();


            System.out.println("Service Quality:");
            quality = scan.next();


            switch (quality.toLowerCase()){

                case "poor":
                    totalTip = totalToPay * 0.05 ;
                    break;

                case "fair":
                    totalTip = totalToPay * 0.1 ;
                    break;

                case "good":
                    totalTip = totalToPay * 0.15 ;
                    break;

                case "great":
                    totalTip = totalToPay * 0.2;
                    break;

                case "excellent":
                    totalTip = totalToPay * 0.25;
                    break;

            }
            // totalToPay, totalTip, totalPerPerson, tipPeerPerson;

            totalToPay = totalToPay + totalTip;
            totalPerPerson = totalToPay/numOfPeople;
            tipPeerPerson = totalTip /numOfPeople;

            String numPpAmpersand = "";
            for (int x=1; x<= numOfPeople; x++){
                numPpAmpersand += "&";
            }
            System.out.println("Number of people entered: " + numPpAmpersand);
            System.out.println("Total to pay: "+ totalToPay);
            System.out.println("Total tip: " + totalTip);
            System.out.println("Total per person: "+ totalPerPerson);
            System.out.println("Tip per person: " + tipPeerPerson);


        }

    }
}
