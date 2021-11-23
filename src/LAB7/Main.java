package LAB7;

public class Main {
    public static void main(String[] args) {
        //Task Basic
        Square square = new Square(5);
        Triangle triangle= new Triangle(10,16,25);
        Rectangle rectangle = new Rectangle(80,3);
        System.out.println("Patratul are aria: "+square.getArea()+" si perimetrul: "+square.getPerimeter());
        System.out.println("Dreptunghiul are aria: "+rectangle.getArea()+" si perimetrul: "+rectangle.getPerimeter());
        System.out.println("Triunghiul are aria: "+triangle.getArea()+" si perimetrul: "+triangle.getPerimeter());

        //Task Medium
        Figure[] figureList={rectangle,square,triangle};
        System.out.println("Cea mai mare arie are figura: "+FigureController.getBiggestArea(figureList));
        System.out.println("Cel mai mare perimetru are figura: "+FigureController.getBiggestPerimeter(figureList));

        //Task Advanced
        Figure circle = new Figure() {
            double r=9;

            @Override
            public double getArea() {
                return r*r*Math.PI;
            }

            @Override
            public double getPerimeter() {
                return 2*r*Math.PI;
            }

            @Override
            public String toString() {
                return "Circle{" +
                        "r=" + r +
                        '}';
            }
        };
        System.out.println("Cercul are aria: "+circle.getArea()+" si perimetrul: "+circle.getPerimeter());

        Figure[] figureList2={rectangle,square,triangle,circle};
        System.out.println("Cea mai mare arie are figura: "+FigureController.getBiggestArea(figureList2));
        System.out.println("Cel mai mare perimetru are figura: "+FigureController.getBiggestPerimeter(figureList2));
    }
}