package LAB8;

public class Main {
    public static void main(String[] args) {

        Cube cube = new Cube(5);
        Sphere sphere = new Sphere(4.7);
        Parallelepiped parallelepiped = new Parallelepiped(80, 3, 6);
        System.out.println("Cubul are suprafata: " + cube.getSurface() + " si volumul: " + cube.getVolume());
        System.out.println("Paralepipedul are suprafata: " + parallelepiped.getSurface() + " si volumul: " + parallelepiped.getVolume());
        System.out.println("Sfera are suprafata: " + sphere.getSurface() + " si volumul: " + sphere.getVolume());

        GeometricBody[] figureList = {parallelepiped, cube, sphere};
        System.out.println("Cea mai mare suprafata are figura: " + GeometricBodyController.getBiggestSurface(figureList));
        System.out.println("Cel mai mare volum are figura: " + GeometricBodyController.getBiggestVolume(figureList));
    }
}