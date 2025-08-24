public class areacalculator{
    public static int areaafterresize(shape s, int width, int height){
        s.resize(width,height);
        return s.area();
    }
}
