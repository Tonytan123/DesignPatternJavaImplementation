package visitor;

/**
 * @author tonyc
 */
public class Client {
    public static void main(String[] args) {
        ObjectStruct objectStruct = new ObjectStruct();
        Person men = new Men();
        objectStruct.addPerson("men", men);
        Person woMen = new Women();
        objectStruct.addPerson("woMen", woMen);
        Action action = new Success();
        objectStruct.notifyAllPerson(action);
        Action actionTwo = new Failure();
        objectStruct.notifyAllPerson(actionTwo);
    }
}
