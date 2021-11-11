package LAB6;

import java.util.Date;

public class Doctor extends OperationsStaff {
    String[] specialty;
    String[] locations;

    public Doctor(String title, String givenName, String middleName, String familyName, Date birthDate, Gender gender, Address homeAddress, Phone phone, Date joined, String[] education, String[] certification, String[] languages, String[] specialty, String[] locations) {
        super(title, givenName, middleName, familyName, birthDate, gender, homeAddress, phone, joined, education, certification, languages);
        this.specialty = specialty;
        this.locations = locations;
    }
}
