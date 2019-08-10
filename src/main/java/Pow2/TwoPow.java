package Pow2;

public class TwoPow {
    public int powIter (int exp) {

        int result = 1;

        if(exp == 1)
            return 1;
        else{
        for(int i =1;i<=exp;i++)
        {
            result*= 2;
        }
        return result;}
    }

    public int powRec(int exp){
        if(exp==0)
            return 1;
        return powRec(exp-1)*2;
    }


}
