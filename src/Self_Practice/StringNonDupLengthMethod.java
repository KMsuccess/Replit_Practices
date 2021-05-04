package Self_Practice;


import java.util.Arrays;
import java.util.Collections;

public class StringNonDupLengthMethod {

    public static void main(String[] args) {

        length("abbbb");
//========================================================================
        frequency("NNKKLMSDD");

        //  removeDoup("KKLLNM");
    }

    private static void length(String str ){

        String nonDup = "";
        for (String each : str.split("")){
                if(!nonDup.contains(each)) {
                    nonDup += each;
                }
        }
        System.out.println(nonDup +": length --> "+ nonDup.length());

    System.out.println("=====================================================");


    }public static String frequency(String str) {

        String nonDup="", result="";
        for(int i=0; i < str.length(); i++)
            if(! nonDup.contains(""+str.charAt(i)))
                nonDup += ""+str.charAt(i);

        for(int i=0; i < nonDup.length(); i++) {
            int num = Collections.frequency( Arrays.asList(str.split("")),""+nonDup.charAt( i ));
            result += ""+nonDup.charAt(i) + num;
        }
        System.out.println(result);   //  ???
        return result;    //  ????  doesn`t  runs



    }



//       public static String removeDoup (String str1){
//        str1 =new LinkedHashSet<String>(Arrays.asList(str1.split(""))).toString();
//        str1 =str1.replace(",","").replace("[", "").replace("]", "");
//        return str1;
//       }

}
