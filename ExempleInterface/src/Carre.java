public class Carre extends AForme {
    private double cote = 0.0;

    public Carre(double cote) {
        this.cote = cote;
    }

    public double superficie() {
        return this.cote * this.cote;
    }
}
