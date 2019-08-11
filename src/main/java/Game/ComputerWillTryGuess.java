package Game;

import java.util.Random;
import java.util.Scanner;

public class ComputerWillTryGuess {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Rzuce liczbe dla komputera");
        int input = s.nextInt();
        int limit = 100;
        int additional = 0;
        Random random = new Random();
        for (int i = 0; i < 5; i++) {

            int output = random.nextInt(limit) + additional;
            System.out.println(output);
            if(output == input) {
                System.out.println("Mam cie !");
                break;
            }
            else{
                System.out.println("Prawie...");
                if(output>input) {
                    limit = output;
                    additional = 0;
                }
                if(output< input){
                    limit = output;
                    additional = 100-output;
                }

            }
        }

    }
    }

