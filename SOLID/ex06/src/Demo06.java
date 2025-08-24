public class Demo06{
    public static void main(String[] args){
        Bird penguin=new Penguin();
        penguin.makeSound();
        
        FlyingBird eagle=new FlyingBird("Eagle");
        eagle.makeSound();
        eagle.fly();
        
        Aviary av=new Aviary();
        av.release(eagle);
    }
}