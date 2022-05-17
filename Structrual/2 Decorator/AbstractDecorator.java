/**
 * AbstractDecorator
 */
public abstract class AbstractDecorator extends SMSService {

    protected SMSService notificationService;

    public void SetService(SMSService service) {
        notificationService = service;
    }

    @Override
    public String SendSMS(String sender, String receiver, String msg) {
        if(notificationService != null){
            return notificationService.SendSMS(sender, receiver, msg);
        }else{
            return "Notification Service Not Initialized";
        }
    }
}