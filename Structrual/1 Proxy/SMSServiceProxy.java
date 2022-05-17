import java.util.Dictionary;
import java.util.Hashtable;

/**
 * SMSServiceProxy
 */
public class SMSServiceProxy {

    private SMSService smsService;
    Dictionary sentCount = new Hashtable<String, Integer>();

    public String SendSMS(String sender, String receiver, String msg){
        if(smsService == null) smsService = new ConcreteSMSService();

        if(sentCount.get(sender) == null) sentCount.put(sender, 0);

        int prevSent = sentCount.get(sender);
        if(prevSent >= 2) return "SMS Not Sent";

        return smsService.SendSMS(sender, receiver, msg);
    }
}