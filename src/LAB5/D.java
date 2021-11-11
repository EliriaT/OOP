package LAB5;

class D extends C {
    protected String d;
    protected X x = new X("ClassD");

    public D(String d, X x) {
        super(d, x);
        this.d = "d";
    }

    @Override
    public String toString() {
        return " d = " + d + ", " + super.toString();
    }
}
