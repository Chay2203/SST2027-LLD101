public class walletpayment implements paymentprocessor{
    public String process(double amount){
        return "Wallet debit: "+amount;
    }
    public boolean canhandle(String provider){
        return "WALLET".equals(provider);
    }
}
