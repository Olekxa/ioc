package applicationTwo;

public class Locator {
    private static Cache cache = new Cache();

    public static MessageService getService(String serviceName) {
        MessageService worker = cache.getService(serviceName);

        if (worker != null) {
            return worker;
        }
        Inite context = new Inite();
        MessageService service1 = (MessageService) context
                .lookUp(serviceName);
        cache.addService(service1);
        return service1;
    }
}
