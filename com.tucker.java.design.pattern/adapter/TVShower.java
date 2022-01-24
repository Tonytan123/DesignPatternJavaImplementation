package adapter;

/**
 * @author tonyc
 */
public class TVShower {
    public static void main(String[] args) {
        People chinesePeople = new Translator();
        People englishPeople = new EnglishPeople();
        englishPeople.eat();
        englishPeople.sleep();
        englishPeople.run();
        chinesePeople.eat();
        chinesePeople.run();
        chinesePeople.sleep();
    }
}
