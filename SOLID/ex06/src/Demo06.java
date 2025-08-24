public class demo06{
    public static void main(String[] args){
        aviary aviary=new aviary();        
        flyingbird sparrow=new flyingbird("Sparrow");
        aviary.release(sparrow);
        
        penguin penguin=new penguin();
        aviary.release(penguin);        
        penguin.swim();
    }
} 