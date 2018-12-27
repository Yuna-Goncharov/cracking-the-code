//fibbonachi

public class fibonacci {
    public void fiboo(int n)

    {
        int first = 0;
        int second = 1;
        int third;
        System.out.println(first);
        System.out.println(second);
        for(int i = 2 ; i< n ; i ++) {
            third = second + first;
            System.out.println(third);
            first = second;
            second = third;

        }

    }

    public static class main{
        public static void main(String[] args){
            int n = 8;
            fibonacci f = new fibonacci();
            System.out.println("fiboonachi: " );
            f.fiboo(n);

        }
    }
}
