package LAB8;


public class GeometricBodyController {

    public static GeometricBody getBiggestVolume(GeometricBody[] figures){
        double maxVolume=0;
        GeometricBody biggestFigure = null;

        for (GeometricBody figure:figures){
            if(maxVolume<figure.getVolume()){
                maxVolume=figure.getVolume();
                biggestFigure=figure;
            }
        }
        return biggestFigure;
    }

    public static GeometricBody getBiggestSurface(GeometricBody[] figures){
        double maxSurface=0;
        GeometricBody biggestFigure = null;

        for (GeometricBody figure:figures){
            if(maxSurface<figure.getSurface()){
                maxSurface=figure.getSurface();
                biggestFigure=figure;
            }
        }
        return biggestFigure;
    }
}
