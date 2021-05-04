package Java_Interveiw_Coding_Session;

public class StringFindFirstNonRepeatingCharacter_returnItsIndex {

    /*
    38. Given a string, find the first non-repeating character in it and return its
    index. If it doesn't exist, return -1.
     */
    public static int indexOfFirstNonRepeatingChar(String s){
        for(int i = 0; i < s.length(); i++){
            int count =0;
            for(char each: s.toCharArray()) {
                if (each == s.charAt(i)) {
                    count++;
                }
            }
            if(count == 1) {
                return i;
            }
        }
        return -1;
    }
}
