/**
 * ConcreteSMSService
 */
public class ConcreteSMSService extends SMSService {

    @Override
    public String SendSMS(String sender, String receiver, String msg) {
        return String.format("SMS sent to: %s from : %s\n", receiver, sender);
    }
}
