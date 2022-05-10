package applicationTwo;

public class Inite {
    public MessageService lookUp(String serviceName) {
        if (serviceName.equalsIgnoreCase("TelegramService")) {
            return new TelegramService();
        } else if (serviceName.equalsIgnoreCase("MailService")) {
            return new MailService();
        }
        return null;
    }
}
