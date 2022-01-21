package proxy;

/**
 * @author tonyc
 */
public class Proxy implements InterfaceProxy{
    public InterfaceProxy interfaceProxy;

    @Override
    public void request() {
        if(interfaceProxy == null) {
            interfaceProxy = new RealSubject();
        }
        interfaceProxy.request();
    }
}
