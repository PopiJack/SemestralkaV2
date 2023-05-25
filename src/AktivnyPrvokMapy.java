/**
 * Abstraktna trieda, ktora predstavuje vsetky prvky mapy, ktore spolu
 * musia komunikovat
 */
public abstract class AktivnyPrvokMapy {
    private int poziciaX;
    private int poziciaY;
    private int sirka;
    private int vyska;
    private String nazov;

    private int privilegium;

    /**
     * inicializacia
     * @param poziciaX
     * @param poziciaY
     * @param sirka
     * @param vyska
     * @param nazov
     * @param privilegium
     */

    public AktivnyPrvokMapy(int poziciaX, int poziciaY, int sirka, int vyska, String nazov, int privilegium) {
        this.poziciaX = poziciaX;
        this.poziciaY = poziciaY;
        this.sirka = sirka;
        this.vyska = vyska;
        this.nazov = nazov;
        this.privilegium = privilegium;
    }

    /**
     * dostavame poziciuX
     * @return poziciaX
     */

    public int getPoziciaX() {
        return this.poziciaX;
    }

    /**
     * nastavujeme poziciaX
     * @param poziciaX
     */
    public void setPoziciaX(int poziciaX) {
        this.poziciaX = poziciaX;
    }

    /**
     * Vracia nam poziciuY
     * @return poziciaY
     */
    public int getPoziciaY() {
        return this.poziciaY;
    }

    /**
     * nastavujeme poziciuY
     * @param poziciaY
     */

    public void setPoziciaY(int poziciaY) {
        this.poziciaY = poziciaY;
    }

    /**
     * Vracia nam sirku objektu
     * @return sirka
     */

    public int getSirka() {
        return this.sirka;
    }

    /**
     * nastavujeme sirku objektu
     * @param sirka
     */

    public void setSirka(int sirka) {
        this.sirka = sirka;
    }

    /**
     * vracia nam vysku objektu
     * @return vyska
     */

    public int getVyska() {
        return this.vyska;
    }

    /**
     * nastavujeme vysku objektu
     * @param vyska
     */
    public void setVyska(int vyska) {
        this.vyska = vyska;
    }

    /**
     * ziskavame nazov
     * @return nazov
     */

    public String getNazov() {
        return this.nazov;
    }
    /**
     * Nastavujeme nazova
     * @param nazov
     */

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }



}
