package Game;


import java.util.Scanner;

public class MainGame {

    public static void main(String[] args) {

        GeneratorOfDigit a = new GeneratorOfDigit();
        int toCheck = a.randomDigit();
        //System.out.println(toCheck);
        Scanner s = new Scanner(System.in);
        System.out.println("Strzelaj");
        for (int i = 0; i <5 ; i++) {
            int input = s.nextInt();
            if(input == toCheck){
                System.out.println("Trafiles ! ");
                break;
            }
            else {
                System.out.println("Pudlo !");
                if(input > toCheck)
                    System.out.println("Za duzo stary");
                else if (toCheck > input)
                    System.out.println("Za malo");
            }
        }


    }
}
