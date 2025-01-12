

/* Creazione interfaccia, prima di provare a cambiare il tutto con while per migliorare
la user experience*/

/*
package myApplication;

import java.util.Scanner;

public class modificheOld {

    Scanner sc = new Scanner(System.in);
    ElementoMultimediale[] elemento = new ElementoMultimediale[5];
    int indexCounter = 0;

        while (indexCounter < 5) {

        System.out.println("Ciao! Seleziona:");
        System.out.println(" - 1 - per stampare un'immagine");
        System.out.println(" - 2 - per stampare un audio");
        System.out.println(" - 3 - per stampare un video");

        int selezioneMedia = sc.nextInt();
        sc.nextLine();  */
/*Necessario altrimenti il terminale mi saltava un comando*//*


        */
/*-----PRIMA POSSIBILITà : IMMAGINE----------------------------------------------------------------*//*

        if (selezioneMedia == 1) {
            System.out.println("Adesso scegli un titlo per la tua immagine:");
            String titoloMedia = sc.nextLine();

            System.out.println("Quanto vuoi che sia luminosa da 1 a 10 l'immagine `" + titoloMedia + "`?");

            int luminosità = sc.nextInt();
            if (luminosità > 0 && luminosità <= 10) {
                Immagine img = new Immagine(titoloMedia, luminosità);
                // img.show(); Commentato poichè voglio che la stampa definitiva avvenga alla fine
                elemento[indexCounter] = img;
                indexCounter++;
            } else {
                System.out.println("Per favore seleziona un valore tra 1 e 10");
            }
            */
/*-----SECONDA POSSIBILITà : AUDIO----------------------------------------------------------------*//*

        } else if (selezioneMedia == 2) {
            System.out.println("Adesso scegli un titlo per il tuo audio:");
            String titoloMedia = sc.nextLine();

            System.out.println("Quanto vuoi che sia alto il volume da 1 a 10 dell'audio `" + titoloMedia + "`?");
            int volume = sc.nextInt();
            if (volume > 0 && volume <= 10) {
                System.out.println("Volume alzato a " + volume);
            } else {
                System.out.println("Per favore seleziona un valore tra 1 e 10");
            }
            System.out.println("Quanti minuti dura l'audio `" + titoloMedia + "`?");
            int durata = sc.nextInt();
            if (durata > 0) {
                Audio a = new Audio(titoloMedia, volume, durata);
                // a.play();
                elemento[indexCounter] = a;
                indexCounter++;
            } else {
                System.out.println("Inserisci un valore, intero e posito per favore");
            }
            */
/*-----TERZA POSSIBILITà : VIDEO----------------------------------------------------------------*//*

        } else if (selezioneMedia == 3) {
            System.out.println("Adesso scegli un titlo per il tuo video:");
            String titoloMedia = sc.nextLine();

            System.out.println("Quanto vuoi che sia luminoso da 1 a 10 il video `" + titoloMedia + "`?");

            int luminosità = sc.nextInt();
            if (luminosità > 0 && luminosità <= 10) {
                System.out.println("Luminosità impostata a " + luminosità);
            } else {
                System.out.println("Per favore seleziona un valore intero tra 1 e 10");
            }
            System.out.println("Quanto vuoi che sia alto il volume, da 1 a 10, del video `" + titoloMedia + "`?");
            int volume = sc.nextInt();
            if (volume > 0 && volume <= 10) {
                System.out.println("Volume alzato a " + volume);
            } else {
                System.out.println("Per favore seleziona un valore intero tra 1 e 10");
            }
            System.out.println("Quanti minuti dura il video `" + titoloMedia + "`?");
            int durata = sc.nextInt();
            if (durata > 0) {
                Video v = new Video(titoloMedia, luminosità, volume, durata);
                // v.play();
                elemento[indexCounter] = v;
                indexCounter++;
            } else {
                System.out.println("Inserisci un valore, intero e posito per favore");
            }
        } else {
            System.out.println("Inserisci un valore da 1 a 3");
        }
    }

        System.out.println("Ottimo, hai occupato la memoria disponibile! quale traccia vuoi ascoltare ora?");
        System.out.println(" - 1 - " + elemento[0].getTitolo());
        System.out.println(" - 2 - " + elemento[1].getTitolo());
        System.out.println(" - 3 - " + elemento[2].getTitolo());
        System.out.println(" - 4 - " + elemento[3].getTitolo());
        System.out.println(" - 5 - " + elemento[4].getTitolo());
        System.out.println(" - 411 - per riprodurle tutte in sequenza!"); // 411 perchè sembra "All"
        System.out.println(" - 0 - per uscire dal programma!");

    int selezioneFinale = sc.nextInt();
        sc.nextLine();

        if (selezioneFinale >= 1 && selezioneFinale <= 5) {
        ElementoMultimediale selezionato = elemento[selezioneFinale - 1]; */
/*Poichè l'index dell'array è in base 0*//*

        if (selezionato instanceof Immagine) {
            ((Immagine) selezionato).show(); */
/*qui eseguo il casting in modo da gestire dinamicamente il dato e ripeto sotto*//*

        } else if (selezionato instanceof Audio) {
            ((Audio) selezionato).play();
        } else if (selezionato instanceof Video) {
            ((Video) selezionato).play();
        }
    } else if (selezioneFinale == 411) {
        for (int i = 0; i < elemento.length; i++) {
            ElementoMultimediale selezionato = elemento[i];
            if (selezionato instanceof Immagine) {
                ((Immagine) selezionato).show();
            } else if (selezionato instanceof Audio) {
                ((Audio) selezionato).play();
            } else if (selezionato instanceof Video) {
                ((Video) selezionato).play();
            }
        }
    } else if (selezioneFinale == 0) {
        System.out.println("Uscita dal programma.");
    } else {
        System.out.println("Per favore, seleziona un valore valido.");
    }
}
*/
