package test;

import decorativepattern.*;
import org.junit.Test;

/**
 * @author tonyc
 */
public class ComponentTest {

    @Test
    public void decorativePatternTest() {
        Component component = new ConcreteComponent();
        AbstractDecorator decoratorA = new DecoratorA();
        AbstractDecorator decoratorB = new DecoratorB();
        decoratorB.setComponent(component);
        decoratorA.setComponent(decoratorB);
        decoratorA.operation();
    }
}