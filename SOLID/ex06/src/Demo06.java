public class Demo06{
    public static void main(String[] args){
        bird penguin=new penguin();
        penguin.walk();
        
        flyingbird eagle=new flyingbird();
        eagle.walk();
        eagle.fly();
        
        aviary av=new aviary();
        av.makebirdfly(eagle);
    }
}