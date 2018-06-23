public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20);
        Rectangle r2 = new Rectangle(1, 2);
        Rectangles rect = new Rectangles();

        rect.addRectangle(new Rectangle(3.1, 1.6));
        rect.addRectangle(r1);
        rect.addRectangle(r2);

        System.out.println(r1.areaCalc());
        System.out.println(r2.perimetrCalc());
        System.out.println("summary area is "+rect.summaryArea());
    }

//    200.0
//    6.0
//    summary area is 206.96
}
