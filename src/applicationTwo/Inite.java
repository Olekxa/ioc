package applicationTwo;

public class Inite {
    public MessageService lookUp(String workerName) {
        if (workerName.equalsIgnoreCase("Sydorov")) {
            return new TelegramService();
        } else if (workerName.equalsIgnoreCase("Petrov")) {
            return new MailService();
        }
        return null;
    }
}
