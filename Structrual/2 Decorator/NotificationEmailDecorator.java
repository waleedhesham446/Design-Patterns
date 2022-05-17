/**
 * NotificationEmailDecorator
 */
public class NotificationEmailDecorator extends AbstractDecorator {

    public String SMSSendNotification(String receiver, String msg) {
        return String.format("SMS: '%s' sent to: '%s' successfully", msg, receiver);
    }

    @Override
    public String SendSMS(String sender, String receiver, String msg) {
        StringBuilder result = new StringBuilder();
        result.append(super.SendSMS(sender, receiver, msg));
        result.append("\n");
        
        //  decorator method to send mail
        result.append(SMSSendNotification(receiver, msg));
        result.append("\n");
        
        return result.toString();
    }
}