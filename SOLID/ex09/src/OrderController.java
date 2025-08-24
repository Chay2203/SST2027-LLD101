public class ordercontroller{
    private orderrepository repository;
    
    public ordercontroller(orderrepository repository){
        this.repository=repository;
    }
    
    void create(String id){
        repository.save(id);
        System.out.println("Created order: "+id);
    }
} 