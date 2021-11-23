package LAB7;

public class Triangle extends Figure {

    double a;
    double b;
    double c;
    public Triangle(double a,double b,double c){
        if(a+b<=c || a+c<=b || b+c<=a)
        {
           throw new IllegalArgumentException("Vertices do not form a triangle");
        }
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    public double getArea() {
        double p=(a+b+c)/2;
        return Math.round(Math.sqrt(p*(p-a)*(p-b)*(p-c))*100)/100.0;
    }

    @Override
    public double getPerimeter() {

        return a+b+c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}


