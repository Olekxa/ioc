package applicationTwo;

import java.util.ArrayList;
import java.util.List;

public class Cache {
    List<MessageService> services = new ArrayList<>();

    public MessageService getService(String serviceName) {
        // retrieve from the lis
        return null;
    }

    public void addService(MessageService newService) {
        // add to the list
        services.add(newService);
    }
}
