package LAB8;

public class Sphere implements GeometricBody {

    double r;

    public Sphere(double r) {
        this.r = r;
    }
    @Override
    public double getSurface() {
        return 4 * Math.PI * r * r;
    }

    @Override
    public double getVolume() {
        return 4/3 * Math.PI * r * r * r;
    }


    @Override
    public String toString() {
        return "Sphere{" +
                "r=" + r +
                '}';
    }
}


