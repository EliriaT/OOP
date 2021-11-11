package LAB5;

class E extends D {
    public String e;

    public E(String e, X x) {
        super(e, x);
        this.e = "e";
    }

    @Override
    public String toString() {
        return " e = " + e + ", " + super.toString();
    }
}
