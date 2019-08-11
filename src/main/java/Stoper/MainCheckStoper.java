package Stoper;

import java.util.ArrayList;
import java.util.List;

public class MainCheckStoper {
    public static void main(String[] args) {

        StopWatch s = new StopWatch();

        s.start();

        List list = new ArrayList();
        for (int i = 0; i < 10000 ; i++) {

            list.add(i*2);
        }

        s.stop();

        System.out.println(s.stop());

    }
}
