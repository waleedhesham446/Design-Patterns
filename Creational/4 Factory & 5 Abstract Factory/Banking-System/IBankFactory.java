/**
 * IBankFactory
 */
public interface IBankFactory {

    IBank GetBank(String bankCode);

    IPaymentCard GetPaymentCard(String cardNo);
}