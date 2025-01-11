package myApplication;

import myApplication.Interfacce.Luminosità;
import myApplication.Interfacce.Riproducibile;

public class Video extends ElementoMultimediale implements Riproducibile, Luminosità {
    private int volume;
    private int durata;
    private int luminosità;

    public Video(String titolo, int durata){
        super(titolo);
        this.luminosità = 5;
        this.volume = 5;
        this.durata = durata;
    }

    @Override
    public String asterischi() {
        String asterischi = "";
        for (int i = 0; i < luminosità; i++) {
            asterischi += "*";
        }
        return asterischi;
    }

    @Override
    public String esclamativi() {
        String esclamativi = "";
        for (int i = 0; i < volume; i++) {
            esclamativi += "!";
        }
        return esclamativi;
    }

    @Override
    public void play() {
        if (durata > 0){
            for (int i = 0; i < durata; i++) {
                System.out.println("Audio: " + titolo + " " + esclamativi() + " " + asterischi());
            }
        }else {
            System.out.println("Inserire un numero > 0 per la durata");
        }
    }

    @Override
    public void abbassaVolume() {
        if (volume > volMin ) {
            volume--;
        } else {
            System.out.println("Il volume è già al minimo.");

        }
    }

    @Override
    public void alzaVolume() {
        if (volume < volMax ) {
            volume++;
        } else {
            System.out.println("Il volume è già al massimo.");

        }
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
