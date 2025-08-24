public class penguin extends bird{
    public penguin(){
        super("Penguin");
    }
    public void swim(){
        System.out.println(name+" swims gracefully");
    }
    public void makeSound(){
        System.out.println(name+" honks");
    }
}
