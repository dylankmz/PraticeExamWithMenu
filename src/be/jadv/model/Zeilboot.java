package be.jadv.model;

public class Zeilboot extends Schip {

    private int masten;

    public Zeilboot() {
    }

    public Zeilboot(String naam, double lengte, int masten) {
        super(naam, lengte);
        this.masten = masten;
    }

    public int getMasten() {
        return masten;
    }

    public void setMasten(int masten) {
        this.masten = masten;
    }

    @Override
    public String toString() {
        return "Zeilboot: " + naam + ", lengte: " + lengte + " meter, " + "met " + getMasten() + " mast(en).";
    }
}
