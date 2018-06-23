import java.util.ArrayList;

public class Rectangles {
    private final ArrayList <Rectangle> rectangleslist = new ArrayList<>();

    public void addRectangle(Rectangle rect){
        rectangleslist.add(rect);
    }
    public double summaryArea(){
        double sumArea = 0;
        for (Rectangle r: rectangleslist) {
            sumArea=sumArea+r.areaCalc();
        }
        return sumArea;
    }
}
