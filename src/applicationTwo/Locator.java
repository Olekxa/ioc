package applicationTwo;

public class Locator {
    private static Locator locator;
    private Cache cache = new Cache();

    public static Locator getInstance() {
        if (locator == null) {
            locator = new Locator();
        }
        return locator;
    }

    private Locator() {

    }

    public MessageService getService(String serviceName) { //tell unsafe threads
        MessageService service = cache.getService(serviceName);

        if (service != null) {
            return service;
        }
        Inite context = new Inite();
        MessageService service1 = context.lookUp(serviceName);
        cache.addService(service1);
        return service1;
    }
}
