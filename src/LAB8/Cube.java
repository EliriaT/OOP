package LAB8;

public class Cube implements GeometricBody {

    double a;

    public Cube(double a) {
        this.a = a;
    }

    @Override
    public double getSurface() {
        return 6 * a * a;
    }

    @Override
    public double getVolume() {
        return a * a * a;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "a=" + a +
                '}';
    }
}

