import myApplication.Audio;
import myApplication.Immagine;
import myApplication.Video;

import java.awt.print.Printable;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Ciao! Seleziona:");
        System.out.println(" - 1 - per stampare un'immagine");
        System.out.println(" - 2 - per stampare un audio");
        System.out.println(" - 3 - per stampare un video");

        int selezioneMedia = sc.nextInt();
        sc.nextLine();


        if (selezioneMedia == 1) {
            System.out.println("Adesso scegli un titlo per la tua immagine:");
            String titoloMedia = sc.nextLine();

            System.out.println("Quanto vuoi che sia luminosa da 1 a 10 l'immagine `" + titoloMedia + "`?");

            int luminosità = sc.nextInt();
            if (luminosità > 0 && luminosità < 10) {

                Immagine img = new Immagine(titoloMedia, luminosità);
                img.show();
            } else {
                System.out.println("Per favore seleziona un valore tra 1 e 10");
            }
        } else if (selezioneMedia == 2) {
            System.out.println("Adesso scegli un titlo per il tuo audio:");
            String titoloMedia = sc.nextLine();

            System.out.println("Quanto vuoi che sia alto il volume da 1 a 10 dell'audio `" + titoloMedia + "`?");
            int volume = sc.nextInt();
            if (volume > 0 && volume < 10) {
                System.out.println("Volume alzato a " + volume);
            } else {
                System.out.println("Per favore seleziona un valore tra 1 e 10");
            }
            System.out.println("Quanti minuti dura l'audio `" + titoloMedia + "`?" );
            int durata = sc.nextInt();
            if (durata > 0){
                Audio a = new Audio(titoloMedia, volume, durata);
                a.play();
            }else{
                System.out.println("Inserisci un valore, intero e posito per favore");
            }
        } else if (selezioneMedia == 3) {
            
        } 


/*
        Immagine img1 = new Immagine("Tramonto al parco");
        Audio a1 = new Audio("Adele che canta", 3);
        Video v1 = new Video("Signora i limoni", 2);
*/


       /* img1.alzaLuminosità();
        img1.alzaLuminosità();
        img1.alzaLuminosità();
        img1.alzaLuminosità();
        img1.abbassaLuminosità();
        img1.show();

        a1.abbassaVolume();
        a1.abbassaVolume();
        a1.play();

        v1.alzaVolume();
        v1.alzaVolume();
        v1.alzaVolume();
        v1.alzaVolume();
        v1.alzaVolume();

        v1.abbassaLuminosità();
        v1.abbassaLuminosità();
        v1.play();*/


    }
}