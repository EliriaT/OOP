package LAB2.Task1;

class Box {
    public double height = 1;
    public double width = 1;
    public double depth = 1;

    public Box() {
        this.height = 1.0;
        this.width = 1.0;
        this.depth = 1.0;
    }

    public Box(double const_num) {
        this.height = const_num;
        this.width = const_num;
        this.depth = const_num;
    }

    public Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public Double calc_Volume() {
        return height * width * depth;
    }

    public Double calc_Area() {
        return   2 * width * depth + 2 * height * depth + 2 * width * height;
    }
}