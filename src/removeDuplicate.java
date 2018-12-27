public class removeDuplicate {


    public static int[] remove(int[] arr){


        int end = arr.length;
        for(int i =0; i< end ; i++){
            for(int j = i +1 ; j< arr.length ; j++){
                if(arr[i] == arr[j]){
                    arr[j] = arr[end-1];
                    end--;
                    j--;
                }
            }
        }
        int[] whitelist = new int[end];
    /*for(int i = 0; i < end; i++){
        whitelist[i] = arr[i];
    }*/
        System.arraycopy(arr, 0, whitelist, 0, end);
        return whitelist;
    }

    public  static void main(String[] args){
        int[] input = new int[]{1, 1, 3, 7, 7, 8, 9, 9, 9, 10};
        System.out.println(remove(input));
    }
}
