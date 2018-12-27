import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    public static boolean anagram(char[] s, char[] t){

        int str1 = s.length;
        int str2 = t.length;

        if(str1 != str2){
        return false; }

        Arrays.sort(s);
        Arrays.sort(t);

        for(int i =0 ; i< str1; i++){
            if(s[i]!= t[i]){
                return false;
            }
        }
        return true;
    }

    public static  void main(String[] args){
//        char[] st1 = {'t', 'r', 'y' ,'u'};
//        char[] st2 = {'t', 'r', 't' ,'u'};
        char str1[] = { 't', 'e', 's', 't' };
        char str2[] = { 't', 's', 'e', 't' };
        if (anagram(str1, str2))
            System.out.println("The two strings are"
                    + " anagram of each other");
        else
            System.out.println("The two strings are not"
                    + " anagram of each other");
    }

}
