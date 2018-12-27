
//Write a method to replace all spaces in a string with ‘%20’.

//count all spaces
//create new array with new length counting the space*2
//replace from the end to %20
public class replaceSpace {

    public static void replaceFromSpace(char[] s , int length  ){
        int countSpace = 0 ,newLength;
        for(int i = 0 ; i<s.length ; i++){
            if(s[i] == ' '){
                countSpace++;
            }
        }
        newLength = length + countSpace*2;
        s[newLength] = '\0';
        for(int i = length-1 ; i>=0 ; i--){
            if(s[i] == ' '){
                s[newLength -1] = '0';
                s[newLength -2] = '2';
                s[newLength -3] = '%';
                newLength = newLength-3;
            }
            else{
               s[newLength -1] = s[i];
               newLength = newLength-1;
            }
        }
    }
    public static void main(String[] args){
        char str1[] = { 't', 'e', 's', 't', ' ' };
        replaceFromSpace(str1 ,5);

            System.out.print("passed?"  );


    }


}
