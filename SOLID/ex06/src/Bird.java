public class bird{
    protected String name;
    public bird(){
        this.name="Bird";
    }  
    public bird(String name){
        this.name=name;
    }
    public void makeSound(){
        System.out.println(name+" makes a sound");
    }
}
