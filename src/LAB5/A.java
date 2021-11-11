package LAB5;

class A {
    public X x = new X("nameTwo");
    protected String a;

    public A(String a, X x) {
        this.a = "a";
    }

    @Override
    public String toString() {
        return " a = " + a + ", ";
    }
}
