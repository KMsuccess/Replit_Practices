package Self_Practice;

import org.junit.Assert;
import org.junit.Test;




    public  class Inverter{
        public static String invert(String string)  {

            return string;
        }
        @Test
        public void shouldInvert(){

            String inverted= Inverter.invert(null);
            String original = "";

            char [] arr=inverted.toCharArray();
            String reverse="";
            for (int i = arr.length-1; i>=0; i--) {
                reverse+=arr[i];
            }
            if(arr.length==0 && inverted!=null) {
                Assert.assertEquals( "", inverted);
            } else if(arr.length==1){
                Assert.assertEquals(original, inverted);
            } else if(arr.length>1){
                Assert.assertEquals(reverse,inverted);
            }else{
                Assert.fail();
            }
        }


    }



