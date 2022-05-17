/**
 * Visa
 */
public class Visa implements IPaymentCard {
    @Override
    public String GetName() {
        return "Visa Card";
    }

    @Override
    public String GetProviderInfo() {
        return "VISA";
    }
}