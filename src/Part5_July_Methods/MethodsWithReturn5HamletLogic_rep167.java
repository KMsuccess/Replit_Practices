package Part5_July_Methods;
/*
The danish prince most famous quote is "to be or not to be".
that is a classic example of boolean logic.

the hamletQuote method only returns true if one of  or both of the boolean parameters is true.

example:

hamletQuote(true, false)
returns true

hamletQuote(false,true)
returns true

hamletQuote(true,true)
returns true

hamletQuote(false,false)
returns false

hint: use the truth table for this one, this can be done with one if and a logical operator.
 */
public class MethodsWithReturn5HamletLogic_rep167 {

    public boolean hamletQuote(boolean toBe,boolean notToBe)
    {

                   return toBe || notToBe ;
               }


}
