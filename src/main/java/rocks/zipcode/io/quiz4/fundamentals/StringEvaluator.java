package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        List<String> result = new ArrayList<>();
        List<String> checkDupes = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                result.add(string.substring(i, j));
            }
        }
        for (String s : result) {
            if (!checkDupes.contains(s)) {
                checkDupes.add(s);
            }
        }
        return checkDupes.toArray(new String[0]);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        List<String> str1List = new ArrayList<>();
        str1List.addAll(Arrays.asList(getAllSubstrings(string1)));
        String[] str2arr = getAllSubstrings(string2);
        List<String> commons = new ArrayList<>();

        for(String s: str2arr){
            if(str1List.contains(s)){
                commons.add(s);
            }
        }
        return commons.toArray(new String[commons.size()]);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] commons = getCommonSubstrings(string1,string2);
        Integer largest = 0;
        String largeString = "";
        for (String s: commons) {
            if(s.length()>largest){
                largest = s.length();
                largeString = s;
            }
        }
        return largeString;
    }
}
