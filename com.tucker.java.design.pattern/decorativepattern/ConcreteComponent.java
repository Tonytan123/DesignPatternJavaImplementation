package decorativepattern;

/**
 * @author tonyc
 */
public class ConcreteComponent implements Component{
    @Override
    public void operation() {
        System.out.println("inner component operation");
    }
}
