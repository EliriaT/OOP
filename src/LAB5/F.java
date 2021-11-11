package LAB5;

class F extends E {
    protected String f;

    public F(String f, X x) {
        super(f, x);
        this.f = "f";
    }

    @Override
    public String toString() {
        return " f = " + f + ", " + super.toString();
    }
}
