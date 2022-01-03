package proxy;

/**
 * @author tonyc
 */
public class Proxy implements InterfaceProxy{
    public InterfaceProxy interfaceProxy;

    public void request() {
        if(interfaceProxy == null) {
            interfaceProxy = new RealSubject();
        }
        interfaceProxy.request();
    }
}
