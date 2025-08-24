public class OrderController{
    private OrderRepository repository;
    
    public OrderController(OrderRepository repository){
        this.repository=repository;
    }
    
    public void process(String id){
        System.out.println("Processing order "+id);
        repository.save(id);
    }
}