/**
 * Trieda predstavuje mozne emocie cloveka a umiestnenie obrazka
 * na vyjadrenie tejto emocie
 */
public enum Emocie {
    STASTNY("Pictures/Faces/happy.png", 0, 25),
    NEUTRALNY("Pictures/Faces/neutral.png", 25, 50),
    SMUTNY("Pictures/Faces/sad.png", 50, 75),
    VYSTRASENY("Pictures/Faces/scared.png", 75, 100);

    private String cestaKObrazku;
    private int dolnyLimitAdrenalinu;
    private int hornyLimitAdrenalinu;

    /**
     * Inicializacia
     * @param cestaKObrazku
     */
    Emocie(String cestaKObrazku, int dolnyLimitAdrenalinu, int hornyLimitAdrenalinu) {
        this.cestaKObrazku = cestaKObrazku;
        this.dolnyLimitAdrenalinu = dolnyLimitAdrenalinu;
        this.hornyLimitAdrenalinu = hornyLimitAdrenalinu;
    }

    /**
     * Vrati nam konkretnu cestu k obrazku
     * @return cestaKObrazku
     */

    public String getCestuKObrazku() {
        return this.cestaKObrazku;
    }

    /**
     * Vrati nam aky je limit adrenalinu na jednotlive emocie
     * @return
     */
    public int getDolnyLimitAdrenalinu() {
        return this.dolnyLimitAdrenalinu;
    }

    public int getHornyLimitAdrenalinu() {
        return this.hornyLimitAdrenalinu;
    }
}
