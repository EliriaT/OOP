package LAB8;

public class Parallelepiped implements GeometricBody {

    double a;
    double b;
    double c;

    public Parallelepiped(double a, double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    public double getSurface() {
        return 2 * a * b + 2 * b * c + 2 * a * c;
    }

    @Override
    public double getVolume() {
        return a * b * c;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

}

