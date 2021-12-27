package decorativepattern;

/**
 * @author tonyc
 */
public class DecoratorA extends AbstractDecorator{
    public static final String COLOR = "Blue";

    @Override
    public void operation() {
        super.operation();
        System.out.println("we have a "+ COLOR + " T-shirt");
    }
}
