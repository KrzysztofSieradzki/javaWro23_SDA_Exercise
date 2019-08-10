package PrimeNumber;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        CheckPrimeNumber c = new CheckPrimeNumber();

        System.out.println(c.checkNumber(8));
        System.out.println(c.checkNumber(11));
        System.out.println(c.checkNumber2(11));
        c.showAllPrimeNumber(30);
        System.out.println();
        System.out.println(c.getPrimeNumber(30));
        List<Integer> list = c.getPrimeNumber(50);
        System.out.println(list.get(5));
    }
}
