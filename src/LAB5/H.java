package LAB5;

class H extends G {
    protected String h;
    private final X x = new X("ClassH");

    public H(String h, X x) {
        super(h, x);
        this.h = "h";
    }

    public String getX() {
        return x.toString();
    }

    @Override
    public String toString() {
        return " h = " + h + ", " + super.toString();
    }
}
