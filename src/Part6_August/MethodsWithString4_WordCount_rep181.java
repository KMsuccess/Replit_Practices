package Part6_August;

/*
This method gets a string and returns the word count of that string.

example:

wordCount("foo bar")
returns 2

wordCount("one two three")
returns 3

wordCount("bla")
returns 1

hint:

https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#split(java.lang.String)
 */
public class MethodsWithString4_WordCount_rep181 {

    public static int wordCount(String words) {

        String allWords [] = words.split(" ");
        return  allWords.length;

        //  also you can use index of(" "), and count (" ")...


    }

}
