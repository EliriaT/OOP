package LAB5;

class G extends F {
    public String g;

    public G(String g, X x) {
        super(g, x);
        this.g = "g";
    }

    @Override
    public String toString() {
        return " g = " + g + ", " + super.toString();
    }
}
