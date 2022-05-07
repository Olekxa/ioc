package applicationTwo;

public class TelegramService implements MessageService {
    @Override
    public String getMessageBody() {
        return "telegram message";
    }

    @Override
    public String getServiceName() {
        return "TelegramService";
    }
}
