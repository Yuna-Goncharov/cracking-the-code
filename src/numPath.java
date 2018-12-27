//returning num of path in matrix when can go only down and left

public class numPath {

    public static int numOfPath(int n , int m){
       if(n ==1 || m == 1){
           return 1;
       }
    return numOfPath(n-1, m) + numOfPath(n , m-1);

    }
    public static void main(String args[])
    {
        int n = 3;
        int m =3;
     //   numOfPath(n,m);
        System.out.print(numOfPath(n,m));
    }

}


