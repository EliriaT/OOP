package LAB6;

public class Phone {
    int prefix;
    int number;
    String phoneNumber;

    public  Phone(int prefix,int number){
        this.number=number;
        this.prefix=prefix;
        this.phoneNumber=""+prefix+number;
    }
}
