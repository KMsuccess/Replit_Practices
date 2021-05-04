package Java_Interveiw_Coding_Session;

public class CalculatorCredit {

    public static void main(String[] args) {


        double credit = 20000.00;
        double paymentMonth =0 ;
        double percent = 0.02;
        double interest =0;
        double result =.00;
       double month = 60.00;

        double bodyCreditPerMonth = credit/month;

        for(int i= 1; i<=month; i++ ){

           interest = (credit*percent)/12;
           paymentMonth = bodyCreditPerMonth+percent;
           credit = credit-bodyCreditPerMonth-percent;

   //result = credit -(payment - (credit*percent)/12);

            System.out.println("Monthly payment "+i+": " +paymentMonth);
            System.out.println("Credit left after payment "+i+": " +credit);
        }


    }
}
