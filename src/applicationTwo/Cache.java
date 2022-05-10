package applicationTwo;

import java.security.Provider;
import java.util.ArrayList;
import java.util.List;

public class Cache {
    List<MessageService> services = new ArrayList<>();

    public MessageService getService(String serviceName) {
        for (MessageService service : services) {
            if (service.getServiceName().equalsIgnoreCase(serviceName)) {
                return service;
            }
        }
        return null;
    }

    public void addService(MessageService newService) {
        // add to the list
        boolean flag = false;
        for (MessageService service : services) {
            if (service.getServiceName().equalsIgnoreCase(newService.getServiceName())) {
                flag = true;
            }
            if (!flag) {
                services.add(newService);
            }
        }
    }
}
