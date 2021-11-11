package LAB5;

class B extends A {
    protected String b;

    public B(String b, X x) {
        super(b, x);
        this.b = "b";
    }

    @Override
    public String toString() {
        return " b = " + b + ", " + super.toString();
    }
}
