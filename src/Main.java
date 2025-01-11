import myApplication.Audio;
import myApplication.Immagine;
import myApplication.Video;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

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
        v1.play();




    }
}