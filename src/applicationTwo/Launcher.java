package applicationTwo;

public class Launcher {
    MessageService service;

    public Launcher(Locator locator) {
        this.service = locator.getService("TelegramService");
    }

    public MessageService getService() {
        return service;
    }
}
