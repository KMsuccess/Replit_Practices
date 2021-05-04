package Part5_July_Methods;
/*
This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.

It returns true only if both a and b are true or c is true.

https://en.wikipedia.org/wiki/Truth_table

 */
public class MethodsWithReturn7_3Locks_rep169 {
    public boolean threeLocks(boolean a, boolean b, boolean c) {

         // return ( a && b ||c )

        return (a==true&& b==true||c==true);


    }//end threeLocks

}




