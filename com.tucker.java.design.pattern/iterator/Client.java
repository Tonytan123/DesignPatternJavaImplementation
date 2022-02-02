package iterator;

/**
 * @author tonyc
 */
public class Client {
    public static void main(String[] args) {
        String[] stringArr = {"Robert" , "John" ,"Julie" , "Lora"};
        ConcreteContainer concreteContainer = new ConcreteContainer();
        Iterator iterator = concreteContainer.getIterator(stringArr);
        while(iterator.hasNext()){
            System.out.println("name: "+ iterator.next());
        }
    }
}
