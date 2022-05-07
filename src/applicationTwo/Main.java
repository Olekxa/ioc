package applicationTwo;

public class Main {
    public static void main(String[] args) {
        MessageService service
                = Locator.getService("EmailService");
        String email = service.getMessageBody();

        MessageService smsService
                = Locator.getService("SMSService");
        String sms = smsService.getMessageBody();

        MessageService emailService
                = Locator.getService("EmailService");
        String newEmail = emailService.getMessageBody();
    }
}
