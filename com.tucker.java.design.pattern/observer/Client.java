package observer;

import proxy.Proxy;

/**
 * @author tonyc
 */
public class Client {

    public static void main(String[] args) {
        Observer observer = new Boss();
        Observer secretary = new Secretary();
        OrdinaryStaff bob = new OrdinaryStaff("Bob");
        observer.addPerson(bob.getName(), bob);
        secretary.addPerson(bob.getName(), bob);
        OrdinaryStaff alice = new OrdinaryStaff("Alice");
        observer.addPerson(alice.getName(), alice);
        secretary.addPerson(alice.getName(), alice);
        observer.notifyAllPerson();
        secretary.notifyAllPerson();
    }
}
