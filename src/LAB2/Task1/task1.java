package LAB2.Task1;

public class task1 {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(7.8);
        Box box3 = new Box(5.2, 6.14, 3.14);

        System.out.println("Box3's Area is: " + box3.calc_Area());
        System.out.println("Box3's Volume is: " + box3.calc_Volume());
    }
}
