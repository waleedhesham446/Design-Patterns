/**
 * Decorator
 */
public class Decorator {

    public static void main(String[] args) {
        ConcreteSMSService smsService = new ConcreteSMSService();
        NotificationEmailDecorator emailDecorator = new NotificationEmailDecorator();

        emailDecorator.SetService(smsService);
        System.out.println(emailDecorator.SendSMS("011", "010", "Hello"));
    }
    
}