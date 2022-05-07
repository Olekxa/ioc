package applicationTwo;

public class MailService implements MessageService {
    @Override
    public String getMessageBody() {
        return "mail message";
    }

    @Override
    public String getServiceName() {
        return "MailService";
    }
}
