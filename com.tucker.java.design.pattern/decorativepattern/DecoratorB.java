package decorativepattern;

/**
 * @author tonyc
 */
public class DecoratorB extends AbstractDecorator{
    public static final String COLOR = "Red";

    @Override
    public void operation() {
        super.operation();
        System.out.println("we have a " + COLOR + " socks");
    }
}
