public class Demo09{
    public static void main(String[] args){
        OrderRepository sqlrepo=new SQLOrderRepository();
        OrderController sqlcontroller=new OrderController(sqlrepo);
        sqlcontroller.process("order123");
        
        OrderRepository memoryrepo=new MemoryOrderRepository();
        OrderController memorycontroller=new OrderController(memoryrepo);
        memorycontroller.process("order456");
    }
}