package myApplication;

public abstract class ElementoMultimediale {
    protected String titolo;

    public ElementoMultimediale(String titolo){
        this.titolo = titolo;

    }

    // Metodo per ottenere il titolo
    public String getTitolo() {
        return titolo;
    }
}
