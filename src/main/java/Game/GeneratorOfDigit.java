package Game;

import java.util.Random;

public class GeneratorOfDigit {

    public int randomDigit(){
        Random random = new Random();
        int output = random.nextInt(99);
        return output;
    }
}
