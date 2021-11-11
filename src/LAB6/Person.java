package LAB6;

import java.util.Date;

public abstract class Person {
    protected String title;
    protected String givenName;
    protected String middleName;
    protected String familyName;
    protected Date birthDate;
    protected Gender gender;
    protected FullName name;
    protected Address homeAddress;
    protected Phone phone;
    protected Hospital[] hospitals;

    public Person(String title, String givenName, String middleName, String familyName, Date birthDate, Gender gender, Address homeAddress, Phone phone) {
        this.title = title;
        this.givenName = givenName;
        this.middleName = middleName;
        this.familyName = familyName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.homeAddress = homeAddress;
        this.phone = phone;
        this.name = new FullName(givenName, middleName, familyName);
    }
}
