package Assignment10.Question2;

public class Rett {
    private String navn;
    private String Type;
    private int pris;
    private String oppskrift;

    public Rett(String navn, String Type, int pris, String oppskrift) {
        this.navn = navn;
        this.Type = Type;
        this.pris = pris;
        this.oppskrift = oppskrift;
    }

    public String getNavn() {
        return navn;
    }
    public String getType() {
        return Type;
    }
    public int getPris() {
        return pris;
    }
    public String getOppskrift() {
        return oppskrift;
    }
}
