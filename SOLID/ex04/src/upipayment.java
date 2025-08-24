public class upipayment implements paymentprocessor{
    public String process(double amount){
        return "Paid via UPI: "+amount;
    }
    public boolean canhandle(String provider){
        return "UPI".equals(provider);
    }
}
