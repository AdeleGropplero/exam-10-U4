import myApplication.Audio;
import myApplication.ElementoMultimediale;
import myApplication.Immagine;
import myApplication.Video;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ElementoMultimediale[] elemento = new ElementoMultimediale[5];
        int indexCounter = 0;

        while (indexCounter < 5) {

            System.out.println("Ciao! Seleziona:");
            System.out.println(" - 1 - per stampare un'immagine");
            System.out.println(" - 2 - per stampare un audio");
            System.out.println(" - 3 - per stampare un video");

            int selezioneMedia;
            while (true) {
                selezioneMedia = sc.nextInt();
                sc.nextLine();  /*Necessario altrimenti il terminale mi saltava un comando*/
                if (selezioneMedia >= 1 && selezioneMedia <= 3) {
                    System.out.println(" ");
                    /*-----PRIMA POSSIBILITà : IMMAGINE----------------------------------------------------------------*/
                    if (selezioneMedia == 1) {
                        System.out.println("Adesso scegli un titlo per la tua immagine:");
                        String titoloMedia = sc.nextLine();

                        System.out.println("Quanto vuoi che sia luminosa da 1 a 10 l'immagine `" + titoloMedia + "`?");

                        /*int luminosità;*/
                        while (true) {
                            // Creo un loop finchè l'utente non inserisce un valore corretto, purtroppo se inserisce un valore di testo
                            // esce comunque dalla console. Questo metodo è valido solo in caso di numeri.
                            int luminosità = sc.nextInt();

                            if (luminosità > 0 && luminosità <= 10) {
                                Immagine img = new Immagine(titoloMedia, luminosità);
                                // img.show(); Commentato poichè voglio che la stampa definitiva avvenga alla fine
                                elemento[indexCounter] = img;
                                indexCounter++;
                                break;
                            } else {
                                System.out.println("Per favore seleziona un valore valido");
                                System.out.println("Quanto vuoi che sia luminosa da 1 a 10 l'immagine `" + titoloMedia + "`?");
                            }
                        } break;

                        /*-----SECONDA POSSIBILITà : AUDIO----------------------------------------------------------------*/
                    } else if (selezioneMedia == 2) {
                        System.out.println("Adesso scegli un titlo per il tuo audio:");
                        String titoloMedia = sc.nextLine();

                        System.out.println("Quanto vuoi che sia alto il volume da 1 a 10 dell'audio `" + titoloMedia + "`?");
                        int volume;
                        while (true) {
                            volume = sc.nextInt();
                            if (volume > 0 && volume <= 10) {
                                System.out.println("Volume alzato a " + volume);
                                break;
                            } else {
                                System.out.println("Per favore seleziona un valore 'volume' compreso tra 1 e 10");
                            }
                        }

                        System.out.println("Quanti minuti dura l'audio `" + titoloMedia + "`?");
                        while (true) {
                            int durata = sc.nextInt();
                            if (durata > 0) {
                                Audio a = new Audio(titoloMedia, volume, durata);
                                // a.play();  Commentato poichè voglio che la stampa definitiva avvenga alla fine
                                elemento[indexCounter] = a;
                                indexCounter++;
                                break;
                            } else {
                                System.out.println("Inserisci un valore, di durata, intero e posito per favore");
                            }
                        } break;

                        /*-----TERZA POSSIBILITà : VIDEO----------------------------------------------------------------*/
                    } else if (selezioneMedia == 3) {
                        System.out.println("Adesso scegli un titlo per il tuo video:");
                        String titoloMedia = sc.nextLine();

                        System.out.println("Quanto vuoi che sia luminoso da 1 a 10 il video `" + titoloMedia + "`?");

                        int luminosità;
                        while (true) {
                            luminosità = sc.nextInt();
                            if (luminosità > 0 && luminosità <= 10) {
                                System.out.println("Luminosità impostata a " + luminosità);
                                break;
                            } else {
                                System.out.println("Per favore seleziona un valore valido");
                                System.out.println("Quanto vuoi che sia luminosa da 1 a 10 il video `" + titoloMedia + "`?");
                            }
                        }

                        System.out.println("Quanto vuoi che sia alto il volume, da 1 a 10, del video `" + titoloMedia + "`?");
                        int volume;
                        while (true) {
                            volume = sc.nextInt();
                            if (volume > 0 && volume <= 10) {
                                System.out.println("Volume alzato a " + volume);
                                break;
                            } else {
                                System.out.println("Per favore seleziona un valore 'volume' intero tra 1 e 10");
                            }
                        }

                        System.out.println("Quanti minuti dura il video `" + titoloMedia + "`?");
                        while (true) {
                            int durata = sc.nextInt();
                            if (durata > 0) {
                                Video v = new Video(titoloMedia, luminosità, volume, durata);
                                // v.play();  Commentato poichè voglio che la stampa definitiva avvenga alla fine
                                elemento[indexCounter] = v;
                                indexCounter++;
                                break;
                            } else {
                                System.out.println("Inserisci un valore, di durata, intero e posito per favore");
                            }
                        }

                    } break;
                } else {
                    System.out.println("Inserisci un valore da 1 a 3");
                }

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
            ElementoMultimediale selezionato = elemento[selezioneFinale - 1]; /*Poichè l'index dell'array è in base 0*/
            if (selezionato instanceof Immagine) {
                ((Immagine) selezionato).show(); /*qui eseguo il casting in modo da gestire dinamicamente il dato e ripeto sotto*/
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
        /*Idealmente si poteva implementare nella super classe un metodo di riproduzione media valido per tutte e tre le sotto classi
         * e fare l'override nelle singole classi. in questo modo si poteva evitare di fare l'instanceof di ogni casistica. Ma siccome il
         * compito chiedeva espressamente due metodi distinti ho preferito eseguire la comanda.*/
    }
}


        /*
        PROVE INIZIALI PRIMA DELLA CREAZIONE INTERFACCIA

        Immagine img1 = new Immagine("Tramonto al parco");
        Audio a1 = new Audio("Adele che canta", 3);
        Video v1 = new Video("Signora i limoni", 2);

        img1.alzaLuminosità();
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

/*----------------------------------------------------------------------------------------------------------------------*/

