package LAB5;

class C extends B {
    protected String c;

    public C(String c, X x) {
        super(c, x);
        this.c = "c";
    }

    @Override
    public String toString() {
        return " c = " + c + ", " + super.toString();
    }
}
