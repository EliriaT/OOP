package LAB6;

import java.util.Date;

public abstract class Staff extends Person {
    Date joined;
    String[] education;
    String[] certification;
    String[] languages;

    public Staff(String title,
                 String givenName,
                 String middleName,
                 String familyName,
                 Date birthDate,
                 Gender gender,
                 Address homeAddress,
                 Phone phone,
                 Date joined, String[] education, String[] certification, String[] languages) {
        super(title, givenName, middleName, familyName, birthDate, gender, homeAddress, phone);
        this.joined = joined;
        this.education = education;
        this.certification = certification;
        this.languages = languages;
    }
}
