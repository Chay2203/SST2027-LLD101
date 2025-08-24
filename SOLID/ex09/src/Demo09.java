public class Demo09{
    public static void main(String[] args){
        orderrepository sqlrepo=new sqlorderrepository();
        ordercontroller sqlcontroller=new ordercontroller(sqlrepo);
        sqlcontroller.process("order123");
        
        orderrepository memoryrepo=new memoryorderrepository();
        ordercontroller memorycontroller=new ordercontroller(memoryrepo);
        memorycontroller.process("order456");
    }
}