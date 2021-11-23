package LAB7;

public class Rectangle extends Figure {

    double a;
    double b;
    public Rectangle(double a,double b){
        this.a=a;
        this.b=b;
    }

    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public double getPerimeter() {
        return 2*a+2*b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

}

