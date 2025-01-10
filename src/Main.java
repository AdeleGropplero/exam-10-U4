import myApplication.Immagine;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Immagine img1 = new Immagine("Tramonto al parco");
        img1.alzaLuminosità();
        img1.alzaLuminosità();
        img1.alzaLuminosità();
        img1.alzaLuminosità();
        img1.abbassaLuminosità();
        img1.show();
    }
}