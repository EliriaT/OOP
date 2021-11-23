package LAB7;


public class FigureController {

    public static Figure getBiggestArea(Figure[] figures){
        double maxArea=0;
        Figure biggestFigure = null;

        for (Figure figure:figures){
            if(maxArea<figure.getArea()){
                maxArea=figure.getArea();
                biggestFigure=figure;
            }
        }
        return biggestFigure;
    }

    public static Figure getBiggestPerimeter(Figure[] figures){
        double maxPerimeter=0;
        Figure biggestFigure = null;

        for (Figure figure:figures){
            if(maxPerimeter<figure.getArea()){
                maxPerimeter=figure.getArea();
                biggestFigure=figure;
            }
        }
        return biggestFigure;
    }
}
