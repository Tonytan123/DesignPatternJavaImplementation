package observer;

import jdk.nashorn.internal.objects.annotations.Setter;

/**
 * @author tonyc
 */
public class OrdinaryStaff implements Person{

    public String name ;

    public OrdinaryStaff(String name) {
        this.name = name;
    }

    @Override
    public void stopDoSomething(Observer observer) {
        System.out.println("After " + observer.getName() + " remind, " +
                "" + name + " stop doing something and start to do work");
    }

    @Override
    public String getName() {
        return name;
    }
}
