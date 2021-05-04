package Java_Interveiw_Coding_Session;

public class StringSumOfAllIntegersFoundInString {
    /*
    32. return the sum of all integers found in the parameter String

    Please implement this method to
 return the sum of all integers found in the parameter String. You can assume that
 integers are separated from other parts with one or more spaces (' ' symbol).
 For example, s="12 some text 3 7", result: 22 (12+3+7=22)
     */

    public static int getSumOfNumbers(String s) {

       // 1+2+4+8 = 15   All digits separate

        int total = 0;
        for(char each: s.toCharArray())
            if(Character.isDigit(each))
                total += Integer.parseInt(""+each);    //  it will count each digit separately!!!!
        return total;                                     // 1+2+4+8 = 15
    }


    // 34+4+6 = 44  !!!   All digits not separate

    public static int Get_Digit_Sum(String st){              //  "jav34ajs4jk6";   34+4+6 = 44  !!!
        String temp="0";
        int Digit=0;
        for (int i = 0; i <st.length() ; i++) {
            if(Character.isDigit(st.charAt(i))){
                temp+=st.charAt(i);
            }
            else{
                Digit+=Integer.parseInt(temp);
                temp="0";
            }
        }
        return Digit+Integer.parseInt(temp);
    }
    //===============================================================
//    public static void main(String[] args) {
//        String str = "jav34ajs4jk6";
//        System.out.println(Get_Digit_Sum(str));
//======================================================================================
    public static void main(String[] args) {
     //   System.out.println(getSumOfNumbers("12 fr 4 hj8"));      //  it will count each digit separately!!!!
        // 1+2+4+8 = 15

        String A = "AD45BC0 b7m80 ";    // 4+5+7+8 = 24
        int result = 0;
          for (char each : A.toCharArray()){
              if(Character.isDigit(each)){
                  result = Integer.parseInt(""+each);

              }
          }
    }
}