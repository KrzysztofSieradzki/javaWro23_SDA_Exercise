package PersonApp;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private List<Language> languages ;

    public Person(Language language) {
        languages = new ArrayList<Language>();
        languages.add(language);
    }

    public void learn ( Language language){
        languages.add(language);
    }

    public void sayHello(){
        for(Language l : languages){
            System.out.print(l.hello() + " ");
        }
        System.out.println();
    }
}
