public class SQLOrderRepository implements OrderRepository{
    public void save(String id){
        System.out.println("SQL: Save order "+id);
    }
}