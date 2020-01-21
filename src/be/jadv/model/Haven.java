package be.jadv.model;

import java.util.ArrayList;

public class Haven {

    String naam;
    private double maxLengte = 150;
    private double huidigeLengte = 0;

    ArrayList<Schip> schepen = new ArrayList<>();

    public double getMaxLengte() {
        return maxLengte;
    }

    public void setMaxLengte(double maxLengte) {
        this.maxLengte = maxLengte;
    }

    public double getHuidigeLengte() {
        return huidigeLengte;
    }

    public void setHuidigeLengte(double huidigeLengte) {
        this.huidigeLengte = huidigeLengte;
    }

    public ArrayList<Schip> getSchepen() {
        return schepen;
    }

    public void setSchepen(ArrayList<Schip> schepen) {
        this.schepen = schepen;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public boolean aanmeren(Schip s) {
        System.out.println("Aanmeren van " + s.toString());

        if (huidigeLengte + s.getLengte() <= maxLengte) {
            if (s instanceof Vrachtschip) {
                Vrachtschip v = (Vrachtschip) s;
                v.loods();
            }
            huidigeLengte = s.getLengte() + huidigeLengte;
            return schepen.add(s);
        }
        System.out.println("Sorry er is geen plaats meer voor dit schip!");
        return false;
    }

    public void afmeren(String naam) throws Exception {
        Schip schip = null;

        for (Schip s : schepen
        ) {
            if (s.getNaam().equals(naam)) ;
            schip = s;
        }

        if (schip == null) {
            throw new Exception("Afmeren mislukt! Schip: " + naam + " niet gevonden in onze haven!");
        }
        huidigeLengte = huidigeLengte - schip.getLengte();
        schepen.remove(schip);
    }
}
