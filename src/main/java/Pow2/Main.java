package Pow2;

public class Main {

    public static void main(String[] args) {
        TwoPow twoPow = new TwoPow();

        System.out.println(twoPow.powIter(3));
        System.out.println(twoPow.powRec(3));
        System.out.println(twoPow.powBit(3));
    }
}
