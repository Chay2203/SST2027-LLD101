public class demo{
    public static void main(String[] args){
        paymentservice service=new paymentservice();
        System.out.println(service.pay(new payment("CARD",100.0)));
        System.out.println(service.pay(new payment("UPI",50.0)));
        System.out.println(service.pay(new payment("WALLET",25.0)));
    }
}
