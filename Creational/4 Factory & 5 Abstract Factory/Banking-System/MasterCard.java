/**
 * MasterCard
 */
public class MasterCard implements IPaymentCard {

    @Override
    public String GetName() {
        return "Master Card";
    }

    @Override
    public String GetProviderInfo() {
        return "MASTER";
    }
}