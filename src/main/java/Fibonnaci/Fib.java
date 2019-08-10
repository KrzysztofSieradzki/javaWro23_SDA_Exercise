package Fibonnaci;

public class Fib {

    public int fibRek(int n){
        if( n == 0)
            return 0;
        if(n == 1)
            return 1;
        return fibRek(n-1)+fibRek(n-2);
    }

    private int counter = 1;

    public int fibRek2(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        counter = 1;
        return fibREk2(n,0,1);
    }

    private int fibREk2(int n, int p , int pp){

        if( n == counter ++)
            return p+pp;
        int tmp = p;
        p += pp;
        pp = tmp;
        return fibREk2(n, p, pp);

    }

    public int fibIter(int n){
        if ( n==0)
            return 0;
        if ( n==1)
            return 1;
        int sum =1;
        int p =1,pp=0;

        for(int i = 2; i<n;i++)
        {
            int temp = p;
            p = temp + pp;
            pp = temp;
        }

        return p + pp;
    }
}
