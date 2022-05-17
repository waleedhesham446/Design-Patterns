/**
 * FactoryMethod
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactoryMethod {

    public static void main(String[] args) throws IOException {
        String cardNo, bankCode;
        // BankA bankA = new BankA();
        // BankB bankB = new BankB();
        BankFactory bankFactory = new BankFactory();
        
        System.out.println("Enter your card number");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        cardNo = reader.readLine();
        bankCode = cardNo.substring(0, 6);
        IPaymentCard paymentCard = bankFactory.GetPaymentCard("12");
        IBank bank = bankFactory.GetBank(bankCode);

        if(bank == null || paymentCard == null){
            System.out.println("Invalid Card Number");
        }else{
            System.out.println(bank.Withdraw());
            System.out.println(paymentCard.GetName());
            System.out.println(paymentCard.GetProviderInfo());
        }
    }
}