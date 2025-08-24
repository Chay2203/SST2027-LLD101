public class paymentservice{
    private java.util.List<paymentprocessor> processors;
    
    public paymentservice(){
        processors=new java.util.ArrayList<>();
        processors.add(new cardpayment());
        processors.add(new upipayment());
        processors.add(new walletpayment());
    }
    
    String pay(payment p){
        for(paymentprocessor processor:processors){
            if(processor.canhandle(p.provider)){
                return processor.process(p.amount);
            }
        }
        throw new RuntimeException("No provider");
    }
}
