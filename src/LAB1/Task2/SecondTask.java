package LAB1.Task2;

public class SecondTask {

    public static void main(String[] args) {

        String[] st_names = {"Mircea Balan", "Alexandru Cuza", "Maria Pescuieru", "Ana Timofin", "Bujoru Grigorescu", "Alexandru Ceban"};
        int[] ages = {21, 20, 22, 24, 19, 20};
        double[] marks = {7.58, 8.98, 9.78, 10, 6.54, 7.3};
        University uniNr1 = new University();
        University uniNr2 = new University();
        University uniNr3 = new University();
        uniNr1.name = "UTM";
        uniNr1.foundationYear = 54;
        uniNr2.name = "USM";
        uniNr2.foundationYear = 101;
        uniNr3.name = "ASEM";
        uniNr3.foundationYear = 20;
        University[] listOfUniv = {uniNr1, uniNr2, uniNr3};
        double sum = 0;
        int count = 0;
        for (University university : listOfUniv) {

            for (int i = 0; i < 2; i++) {
                university.listOfStudents[i] = new Student();
                university.listOfStudents[i].name = st_names[i + count];
                university.listOfStudents[i].age = ages[i + count];
                university.listOfStudents[i].mark = marks[i + count];
                sum = sum + marks[i + count];
            }
            count = count + 2;
        }

        double average = sum / st_names.length;
        System.out.println("Media universitatilor este: " + average);
    }
}

