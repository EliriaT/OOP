package LAB6;

import java.util.Date;

public class Patient extends Person {
    protected int age;
    protected Date accepted;
    protected History sickness;
    protected String[] prescriptions;
    protected String[] allergies;
    protected String[] specialReqs;
    protected OperationsStaff[] operationsStaffs;
    private String id;

    public Patient(String id, String title, String givenName, String middleName, String familyName, Date birthDate, Gender gender, Address homeAddress, Phone phone, int age, Date accepted, History sickness, String[] prescriptions, String[] allergies, String[] specialReqs) {
        super(title, givenName, middleName, familyName, birthDate, gender, homeAddress, phone);
        this.id = id;
        this.age = age;
        this.accepted = accepted;
        this.sickness = sickness;
        this.prescriptions = prescriptions;
        this.allergies = allergies;
        this.specialReqs = specialReqs;
    }

}
