package myApplication;

import myApplication.Interfacce.Luminosità;

import java.sql.SQLOutput;

public class Immagine extends ElementoMultimediale implements Luminosità {

    private int luminosità;

    public Immagine(String titolo, int luminosità) {
        super(titolo);
        this.luminosità = luminosità;
    }

/*    public void stampaTitolo() {
        System.out.println("Titolo immagine: " + titolo);
    }*/

    public String asterischi() {
        String asterischi = "";
        for (int i = 0; i < luminosità; i++) {
            asterischi += "*";
        }
        return asterischi;
    }

    public void show() {
        System.out.println("Immagine: " + titolo + " " + asterischi()); // più asterischi luminosità concatenati
    }


    @Override
    public void alzaLuminosità() {
        if (luminosità < lumMax) {
            luminosità++;
        } else {
            System.out.println("La luminosità è già al massimo.");

        }
    }

    @Override
    public void abbassaLuminosità() {
        if (luminosità > lumMin) {
            luminosità--;
        } else {
            System.out.println("La luminosità è già al minimo.");

        }
    }

}

