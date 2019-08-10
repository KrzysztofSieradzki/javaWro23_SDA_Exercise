package PersonApp;

public class Main {

    public static void main(String[] args) {

        Language polish  = new Polish();
        Language germany  = new Germany();
        Language english  = new English();
        Language russian  = new Russian();

        Person linguist = new Person(polish);
        linguist.learn(germany);
        linguist.learn(russian);
        linguist.learn(english);

        Person littleLingusit = new Person(germany);
        littleLingusit.learn(english);

        Person russianPerson = new Person(russian);

        linguist.sayHello();
        littleLingusit.sayHello();
        russianPerson.sayHello();
    }
}
