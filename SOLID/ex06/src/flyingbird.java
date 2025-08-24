public class flyingbird extends bird implements flyable{
    public flyingbird(){
        super("Flying Bird");
    }
    
    public flyingbird(String name){
        super(name);
    }
    
    public void fly(){
        System.out.println(name+" flaps wings and flies!");
    }
}
