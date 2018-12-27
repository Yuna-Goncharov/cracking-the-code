//Implement an algorithm to determine if a string has all unique characters.
// What if you can not use additional data structures?

public class ArrayAndString1 {
    public static boolean isUnique(String str){

        if(str.length() > 26){
            return false;
        }

        int check = 0 ;
        for(int i =0 ; i< str.length() ; i++){
            double val = str.charAt(i) - 'a';
            double newVal = Math.pow(2.0 , val);
            if((check  > 0.0) && (newVal > 0.0)) return false;
            check += newVal;
        }
        return true;
    }
}
