/**
 * Proxy
 */
public class Proxy {

    public static void main(String[] args) {
        SMSServiceProxy proxy = new SMSServiceProxy();

        System.out.println((proxy.SendSMS("0111", "01000", "Hello")));
        System.out.println((proxy.SendSMS("0111", "01000", "Hello")));
        System.out.println((proxy.SendSMS("0111", "01000", "Hello")));
    }
}