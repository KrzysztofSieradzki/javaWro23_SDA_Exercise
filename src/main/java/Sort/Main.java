package Sort;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int [] table = new int [] {3,1,6,7,2,8,9,4,5};

        BubbleSort bubbleSort = new BubbleSort();
        table = bubbleSort.sort(table);
        for(int n : table)
            System.out.print(n +" ");

        Random r = new Random();
        int [] table2 = new int[10];
        for (int i = 0; i <table2.length ; i++) {
            table2[i] = r.nextInt();
        }
        System.out.print(table2);

        table2 = bubbleSort.sort(table2);
        for(int n : table2)
            System.out.print(n +" ");

    }


}
