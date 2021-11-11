package LAB6;

public class Hospital {
    public String name;
    public Address address;
    public Phone phone;
    public Person[] persons;
    public Department[] departments;

    public Hospital(String name,Address address,Phone phone){
        this.name=name;
        this.address=address;
        this.phone=phone;
    }
}
