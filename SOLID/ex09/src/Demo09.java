public class demo09{
    public static void main(String[] args){
        orderrepository sqlrepo=new SqlOrderRepository();
        ordercontroller sqlcontroller=new OrderController(sqlrepo);
        sqlcontroller.create("ORD-1");        
        orderrepository memrepo=new MemoryOrderRepository();
        ordercontroller memcontroller=new OrderController(memrepo);
        memcontroller.Create("ORD-2");
    }
}
