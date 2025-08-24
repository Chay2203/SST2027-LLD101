public class aviary{
    public void release(flyable bird){
        bird.fly();
        System.out.println("Released flying bird");
    }
    public void release(bird bird){
        bird.makeSound();
        System.out.println("Released bird");
    }
}
