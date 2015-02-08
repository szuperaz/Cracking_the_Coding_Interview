package questions.chapter1;

import java.util.Arrays;

/**
 * Created by szuperaz on 08/02/15.
 */
/* Write a method to decide if two strings are anagrams or not. */
public class Question4 {

    public boolean anagrams (String string1, String string2) {
        string1 = string1.replace(" ", "");
        string2 = string2.replace(" ", "");
        char[] string1Array = string1.toCharArray();
        char[] string2Array = string2.toCharArray();
        Arrays.sort(string1Array);
        Arrays.sort(string2Array);
        return Arrays.equals(string1Array, string2Array);
    }
}
