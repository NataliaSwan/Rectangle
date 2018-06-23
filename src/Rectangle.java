public class Rectangle {
    private final double width;
    private final double height;

    public Rectangle(double width, double height){
        if (width<=0)
            throw new IllegalArgumentException("not pos width");
        if (height<=0)
            throw new IllegalArgumentException("not pos height");
        this.width=width;
        this.height=height;
    }
    public double perimetrCalc(){
        return 2*(width+height);
    }
    public double areaCalc(){
        return width*height;
    }
    //getWidth
    //getHeigth
    //getArea
    //getPerimetr
    //toString

}
