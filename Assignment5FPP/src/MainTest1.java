public class MainTest1{

    //main method
    public static void main(String[] args) {


        Shape[] shapes = new Shape[]{
                new Rectangle("violet", 6, 8),
                new Circle("Blue", 4),
                new Square("Black", 7),
                new Rectangle("White", 8, 9),
                new Circle("Cyan", 11)
        };
        printTotal(shapes);
    }
    public static void printTotal(Shape[] shapes) {

        for (Shape a : shapes) {
            System.out.println(a.calculateArea());
            System.out.println(a.calculatePerimeter());
            System.out.println("***********************************************");
        }
    }
}

