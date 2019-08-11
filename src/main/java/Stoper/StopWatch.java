package Stoper;

public class StopWatch {
    boolean isRunning;
    private long startStoper;
    public void start(){
        long startStoper = System.nanoTime();
         isRunning = true;
    }


    public long stop (){
        if(isRunning == false) {
            System.out.println("Stoper nie zaczął liczyć");
            return -1;
        }
        long stopStoper = System.nanoTime();
        return stopStoper - startStoper;
    }
}
