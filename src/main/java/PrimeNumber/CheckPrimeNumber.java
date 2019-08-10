package PrimeNumber;

import java.util.ArrayList;
import java.util.List;

public class CheckPrimeNumber {

    public String checkNumber(int n){
        int check=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                check++;
        }
        if(check >2)
            return "It's not a prime number";

        return "It is a prime number";
    }

    public boolean checkNumber2(int n){
        if(n<2) return false;
        int d=(int)Math.sqrt(n);
        while(d>1){
            if(n%d==0) return false;
            d--;
        }
        return true;
    }

    public void showAllPrimeNumber(int n){


        for(int i =2;i<=n;i++)
        {
            if(checkNumber2(i)==true)
                System.out.print(i +" ");
        }
    }
    public List<Integer> getPrimeNumber(int limit){

        List<Integer> list = new ArrayList<Integer>();
        for(int i=2;i<=limit;i++){
            if(checkNumber2(i)==true)
                list.add(i);
        }
        return list;
    }

    //public int Eratostenes ( int n){
    //    int [] tab1 =
    //}
}
