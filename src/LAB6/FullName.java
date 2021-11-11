package LAB6;

public class FullName {

    private String givenName;
    private String middleName;
    private String familyName;
    protected String fullName;


    public FullName(String g,String m,String f){
        this.givenName=g;
        this.middleName=m;
        this.familyName=f;
        this.fullName=g+" "+m+" "+f+" ";
    }
}
