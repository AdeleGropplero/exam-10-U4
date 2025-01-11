package myApplication;

import myApplication.Interfacce.Riproducibile;

public class Audio extends ElementoMultimediale implements Riproducibile {

    private int volume;
    private int durata;

    public Audio (String titolo, int volume, int durata){
        super(titolo);
        this.volume = volume;
        this.durata = durata;
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
                System.out.println("Audio: " + titolo + " " + esclamativi());
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
}
