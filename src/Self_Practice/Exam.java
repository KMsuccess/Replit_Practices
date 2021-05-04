package Self_Practice;

public class Exam {

    public static void main(String[] args) {
//
//        int result = 0;
//        for (int i = 1; i <= 2; i++) {
//            for (int j = 1; j <= 100; j++)
//
//                if (i % 5 != 0 & i % 7 != 0) {
//                    result += i;
//                }
//        }
//        System.out.println(result);
//
//
//        System.out.println("===========================================");
//
//        char c = 0;
//        String str = "jack";
//
//
//        for (int i = 0; i < str.length(); i++) {
//
//        }
//
//
//        System.out.println("=================================");
//
//        double x1 = 2;
//        double y1 = 3;
//        double x2 = 5;
//        double y2 = 6;
//        System.out.println(Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1)));
//
//        System.out.println("===================================================");
//
//        String STR = "We have a good day";
//
//        String Result = "";
//        System.out.println(str);
//
//        String b = STR.replace(" ", "");
//        System.out.println(b);
//
//        for (int i = 0; i < b.length(); i++) {
//
//            if (i % 2 == 0) {
//                Result += b.toUpperCase().charAt(i);
//            }
//            if (i % 2 != 0) {
//                Result += b.toLowerCase().charAt(i);
//            }
//            System.out.println(Result);
//        }                                    //         01234567890123
//                                           //  Result = WeHaVeAgOoDdAy
//                                           //       0123456789012345678
//                                         //  STR = "We have a good day"
//        String Result1 = "";
//        String space =" ";
//
//        for (int j = 0; j < STR.length(); ) {
//
//            for (int k = 0; k < Result.length(); k++) {
//                if (Character.isLetter(STR.charAt(j)) && STR.equals(STR.charAt(j))){
//                    Result1 += Result.charAt(k);
//
//                }
//                if (!Character.isLetter(STR.charAt(j))) {
//                    Result1 += STR.charAt(j);
//
//                }
//
//                j++;
//            }
//
//
//            System.out.println(Result1);
//
//        }
        System.out.println("=================================");
//We have a good day
        String STR3 = "Ihave.adog";
          String  Result3 = "";
        for (int i = 2; i < STR3.length(); i++) {

            if (i % 2 == 0) {
                Result3 +=STR3.toLowerCase().charAt(i);
            }
            if (i % 2 != 0) {
                Result3 += STR3.toUpperCase().charAt(i);
            }

        }
        System.out.println(STR3.substring(0,2)+ Result3);
    }
}


