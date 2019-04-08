package rocks.zipcode.io.quiz4.fundamentals;

import rocks.zipcode.io.quiz4.objectorientation.StringAssembler;

import java.util.ArrayList;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        ArrayList<String> pallies = new ArrayList<>();
        String[] substrings = StringEvaluator.getAllSubstrings(string);
        for (String s : substrings) {
            if (s.equals(reverseString(s))) {
                pallies.add(s);
            }
        }
        return pallies.toArray(new String[0]);
    }

    public static Boolean isPalindrome(String string) {
        if(string.equals(reverseString(string))){
            return true;
        }
        return false;
    }

    public static String reverseString(String string) {
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.reverse();
        return sb.toString();
    }
}
