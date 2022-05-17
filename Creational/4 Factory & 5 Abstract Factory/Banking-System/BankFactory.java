/**
 * BankFactory
 */
public class BankFactory implements IBankFactory {
    @Override
    public IBank GetBank(String bankCode) {
        switch (bankCode) {
            case "123456":
                // System.out.println(bankA.Withdraw());
                return new BankA();
                // break;
            case "111111":
                // System.out.println(bankB.Withdraw());
                return new BankB();
                // break;
        
            default:
                // System.out.println("Invalid Card Number");
                return null;
                // break;
        }
    }

    @Override
    public IPaymentCard GetPaymentCard(String cardNo) {
        switch (cardNo) {
            case "12": return new Visa();
            case "34": return new MasterCard();
            default: return null;
        }
    }
}