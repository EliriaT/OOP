package LAB4;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

class Reader {
    public static ArrayList<String> readFile(String fileName) {
        ArrayList<String> file = new ArrayList<>();
        try (Scanner s = new Scanner(new FileReader(System.getProperty("user.dir") + "/src/LAB4/" + fileName))) {
            while (s.hasNext()) {
                file.add(s.nextLine());
            }
            return file;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Este o eroare");
            return null;
        }
    }
}