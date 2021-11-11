package LAB6;

import java.util.Date;

public class Technologist extends  TechnicalStaff{
    public Technologist(String title, String givenName, String middleName, String familyName, Date birthDate, Gender gender, Address homeAddress, Phone phone, Date joined, String[] education, String[] certification, String[] languages) {
        super( title, givenName, middleName, familyName, birthDate, gender, homeAddress, phone, joined, education, certification, languages);
    }
}
