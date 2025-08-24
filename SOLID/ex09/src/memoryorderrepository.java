public class memoryorderrepository implements orderrepository{
    public void save(String id){
        System.out.println("Saved order "+id+" to memory");
    }
}
