public class square implements shape{
    private int side;
    
    public square(){
        this.side=0;
    }
    
    public int area(){
        return side*side;
    }
    
    public void resize(int width, int height){
        if(width!=height){
            throw new IllegalArgumentException("Square must have equal width and height");
        }
        this.side=width;
    }
}
