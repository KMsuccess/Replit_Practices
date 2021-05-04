package Self_Practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class ZX {
    public static void main(String[] args) {

       //  String str = "AS2DA3RTDDAB";


        //  1) Frequency of characters

//        Solution 1:

//        String str = "AS2DA3RTDDAB";
//        String nonDup="", result="";
//        for(int i=0; i < str.length(); i++)
//            if(! nonDup.contains(""+str.charAt(i)))
//                nonDup += ""+str.charAt(i);
//
//        for(int i=0; i < nonDup.length(); i++) {
//            int num = Collections.frequency( Arrays.asList(str.split("")),""+nonDup.charAt( i ));
//            result += ""+nonDup.charAt(i) + num;
//        }
//        System.out.println(result);   //  ???gfv


        // Solution 2:
        /*
        public static String FrequencyOfChars1(String str) {

        String nonDup = "";
        for(int i=0; i < str.length(); i++)
            if(!nonDup.contains(""+str.charAt(i)))
                nonDup+= ""+str.charAt(i);

        String expectedResult = "";

        for( int j=0;j < nonDup.length(); j++) {
            int count = 0;
            for(int i=0; i < str.length(); i++) {
                if(str.charAt(i) == nonDup.charAt(j))
                    count++;
            }
            expectedResult +=nonDup.charAt(j)+"" + count;
        }
        return expectedResult;
    }
         */

//===================================================================================

        //  2) String is digit  Sum  .....

 //  String A = "AD45BC0 b7m80 ";



            //   All digits not separate    "jav34ajs4jk6";   34+4+6 = 44  !!!

//        public static int Get_Digit_Sum(String st){              //  "jav34ajs4jk6";   34+4+6 = 44  !!!
//            String temp="0";
//            int Digit=0;
//            for (int i = 0; i <st.length() ; i++) {
//                if(Character.isDigit(st.charAt(i))){
//                    temp+=st.charAt(i);
//                }
//                else{
//                    Digit+=Integer.parseInt(temp);
//                    temp="0";
//                }
//            }
//            return Digit+Integer.parseInt(temp);



      // 2 t Sum All digits separate    "jav34ajs4jk6";   3+4+4+6 = 17  !!!

//        String A = "AD45BC0 b7m80 ";    // 4+5+7+8+0 = 24
//        int result = 0;
//        for (char each : A.toCharArray()) {
//            if (Character.isDigit(each)) {
//                result += Integer.parseInt("" + each);
//
//            }
//        }


  //=================================================================================

        //Sort Array DES,ASC(it is changing by using > <)

      //  int[] arrNumbers = {14, 8, 5, 54, 41, 10, 1, 500};


//
//        int temp;
//        int[] arrNumbers = {14, 8, 5, 54, 41, 10, 1, 500};
//        System.out.println("Before sort: ");
//        for(int num : arrNumbers)
//        {
//            System.out.println(num);
//        }
//        for(int i = 0; i < arrNumbers.length ; i++)
//        {
//            for(int j = i+1; j < arrNumbers.length ; j++)
//            {
//                if(arrNumbers[i] < arrNumbers[j])
//                {
//                    temp = arrNumbers[i];
//                    arrNumbers[i] = arrNumbers[j];
//                    arrNumbers[j] = temp;
//                }
//            }
//        }
//        System.out.println("After sort: ");
//        for(int num : arrNumbers)
//        {
//            System.out.println(num);
//        }
    }
}
