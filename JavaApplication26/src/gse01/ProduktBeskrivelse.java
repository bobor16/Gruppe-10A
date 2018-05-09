package gse01;

public class ProduktBeskrivelse {

    private String produktID;
    private String beskrivelse;
    private double pris;
    private int standardmeangde;
    private int antalPaaLager;

    public void setProduktID(String produktID) {
        this.produktID = produktID;
    }

    public String getProduktID() {
        return produktID;
    }

    public void setProduktBeskrivels(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public String getProduktBeskrivelse() {
        return beskrivelse;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

    public double getPris() {
        return pris;
    }

    public void setStandardmeangde(int meangde) {
        this.standardmeangde = meangde;
    }

    public double getStandartMeangde() {
        return standardmeangde;
    }

    public void setLagerAntal(int antal) {
        this.antalPaaLager = antal;
    }

    public int getLagerAntal() {
        return antalPaaLager;
    }
}
