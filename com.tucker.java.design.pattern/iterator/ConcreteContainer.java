package iterator;

/**
 * @author tonyc
 */
public class ConcreteContainer implements Container{
    @Override
    public Iterator getIterator(String[] stringArr) {
        return new ConcreteIterator(stringArr);
    }
}
