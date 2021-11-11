package LAB5;

class I extends H {
    protected String i;

    public I(String i, X x) {
        super(i, x);
        this.i = "i";
    }

    @Override
    public String toString() {
        return " i = " + i + ", " + super.toString();
    }
}
