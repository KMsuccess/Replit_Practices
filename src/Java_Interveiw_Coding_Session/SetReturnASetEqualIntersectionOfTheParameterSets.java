package Java_Interveiw_Coding_Session;

import java.util.Set;

public class SetReturnASetEqualIntersectionOfTheParameterSets {
    /*
    31. return a Set equal to the intersection of the parameter Sets
    вернуть Set, равный пересечению наборов параметров
     */


    public static Set<Object> getIntersection(Set<Object> a, Set<Object> b) {
 /*
 Please implement this method to
 return a Set equal to the intersection of the parameter Sets
 The method should not chage the content of the parameters.
 */
        if(a.size() > b.size()){
            a.retainAll(b);
            return a;
        }else{
            b.retainAll(a);
            return b;
        }
    }
}
