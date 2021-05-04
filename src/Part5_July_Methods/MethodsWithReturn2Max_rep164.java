package Part5_July_Methods;
/*
max function gets two ints, x and max.
x is the test case, max is what we test against.

if  x is bigger then max return max
in any other case return x.

for example:

max(1,10)
returns 1

max(11,5)
returns 5
 */
public class MethodsWithReturn2Max_rep164 {

    public int max(int x,int  max)
    {

       /*  if(x<max){
             return  x;
         }else{
             return  max;
         }
         */


         return (x<max) ? x : max;
    }
}
