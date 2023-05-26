/**
 * Trieda predstavuje jednotlive umiestnenia poschodi na mape
 */
public enum Poschodie {
    POSCHODIE0(2000, 1600, "Poschodie0"),
    POSCHODIE1(1580, 1180, "Poschodie1"),
    POSCHODIE2(1140, 740, "Poschodie2"),
    POSCHODIE3(645, 245, "Poschodie3");

    private int minVyska;
    private int maxVyska;
    private String nazov;

    /**
     * Inicializacia
     * @param minVyska
     * @param maxVyska
     * @param nazovPoschodia
     */
    Poschodie(int minVyska, int maxVyska, String nazovPoschodia) {
        this.minVyska = minVyska;
        this.maxVyska = maxVyska;
        this.nazov = nazovPoschodia;
    }

    /**
     * Ziskavame minimalnu vysku
     * @return minVyska (akoby podlaha poschodia)
     */

    public int getMinVyska() {
        return this.minVyska;
    }

    /**
     * Ziskavame maximalnu vysku
     * @return maxVysku (akoby strop poschodia)
     */

    public int getMaxVyska() {
        return this.maxVyska;
    }

    /**
     * Ziskavame konkretny nazov poschodia
     * @return nazovPoschodia
     */

    public String getNazov() {
        return this.nazov;
    }
}
