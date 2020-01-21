package be.jadv;

import be.jadv.model.Haven;
import be.jadv.model.Vrachtschip;
import be.jadv.model.Zeilboot;

public class Main {
    public static void main(String[] args) {

        Vrachtschip v1 = new Vrachtschip();
        v1.setNaam("GroteFrans");
        v1.setLengte(100);
        v1.setLaadVermogen(2500);

        Vrachtschip v2 = new Vrachtschip();
        v2.setNaam("SuperMaramiu");
        v2.setLengte(400);
        v2.setLaadVermogen(7500);

        Zeilboot z1 = new Zeilboot();
        z1.setNaam("SmalleSally");
        z1.setLengte(15);
        z1.setMasten(1);

        Haven h1 = new Haven();
        h1.setNaam("Wally-Kiwi");
        h1.setMaxLengte(150);

        h1.aanmeren(v1);
        h1.aanmeren(z1);

        v1.loods();

        //Dit mag niet lukken
        h1.aanmeren(v2);

        try {
            h1.afmeren("GroteFrans");
            h1.afmeren("SmalleSally");
            h1.afmeren("SuperMaramiu");
        } catch (Exception e) {
            System.out.println("Afmeren mislukt: " + e.getMessage());
        }

        }

    }


