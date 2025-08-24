public class Car implements enginepowered, rechargeable{
    public void startengine(){
        System.out.println("Engine started");
    }
    public void recharge(int kwh){
        System.out.println("Recharged "+kwh+" kWh");
    }
}
