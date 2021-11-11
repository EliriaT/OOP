package LAB5;

class J extends I {
    protected String j;

    public J(String j, X x) {
        super(j, x);
        this.j = "j";
    }

    @Override
    public String toString() {
        return " j = " + j + ", " + super.toString() + getX();
    }
}
