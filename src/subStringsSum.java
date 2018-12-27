//Assume you have a method isSubstring which checks if one word is a substring of another. Given two strings, s1 and s2,
//        write code to check if s2 is a rotation of s1 using only one call to isSubstring
//        (i.e., “waterbottle” is a rotation of “erbottlewat”).



public class subStringsSum {
    public boolean match(String s1, String s2) {
        int len = s1.length();
        if (len == s2.length() && len > 0) {
            String s1s1 = s1 + s1;
            return match(s1s1, s2);
        }
        return false;
    }
}
