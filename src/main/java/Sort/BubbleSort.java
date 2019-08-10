package Sort;

public class BubbleSort {

    public int[] sort(int[] tables){
        boolean isSorted = false; // domyslnie jest juz false, jak cos
        while(!isSorted) {
            isSorted=true;
            for (int i = 0; i < tables.length - 1; i++) {
                if (tables[i] > tables[i + 1]) {
                    int temp = tables[i];
                    tables[i] = tables[i + 1];
                    tables[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
        return tables;
    }
}
