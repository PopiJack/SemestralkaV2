/**
 * Trieda predstavuje mozne emocie cloveka a umiestnenie obrazka
 * na vyjadrenie tejto emocie
 */
public enum Emocie {
    STASTNY("happy.png"),
    NEUTRALNY("neutral.png"),
    SMUTNY("happy.png"),
    VYSTRASENY("scarred.png");

    private String cestaKObrazku;

    /**
     * Inicializacia
     * @param cestaKObrazku
     */
    Emocie(String cestaKObrazku) {
        this.cestaKObrazku = cestaKObrazku;
    }

    /**
     * Vrati nam konkretnu cestu k obrazku
     * @return cestaKObrazku
     */

    public String getCestuKObrazku() {
        return this.cestaKObrazku;
    }
}
