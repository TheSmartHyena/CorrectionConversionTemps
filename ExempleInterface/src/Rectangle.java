public class Rectangle extends AForme {
    private double coteA = 0.0;
    private double coteB = 0.0;

    public Rectangle(double coteA, double coteB) {
        this.coteA = coteA;
        this.coteB = coteB;
    }

    public double superficie() {
        return this.coteA * this.coteB;
    }
}
