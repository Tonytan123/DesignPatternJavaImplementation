package iterator;

/**
 * @author tonyc
 */
public class ConcreteIterator implements Iterator{
    private String[] stringArr;

    private int pos;

    public ConcreteIterator(String[] stringArr) {
        this.stringArr = stringArr;
        pos = 0;
    }
    @Override
    public boolean hasNext() {
        if (stringArr == null || pos >= stringArr.length){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        if(hasNext()){
            return stringArr[pos++];
        }
        return null;
    }
}
