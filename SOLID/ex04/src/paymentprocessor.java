public interface paymentprocessor{
    String process(double amount);
    boolean canhandle(String provider);
}
