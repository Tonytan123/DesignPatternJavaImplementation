package decorativepattern;

/**
 * @author tonyc
 */
public abstract class AbstractDecorator implements Component{
    protected Component component;

    public void operation() {
        component.operation();
    }

    public void setComponent(Component component) {
        this.component = component;
    }
}
