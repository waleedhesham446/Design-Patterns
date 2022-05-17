/**
 * SMSService
 */
public abstract class SMSService {

    public abstract String SendSMS(String sender, String receiver, String msg);
}