import fri.shapesge.Obrazok;

public class Duch extends AktivnyPrvokMapy {
    private Obrazok obrazok;
    private int uhol;

    /**
     * inicializacia
     *
     * @param poziciaX
     * @param poziciaY
     * @param sirka
     * @param vyska
     * @param nazov
     * @param privilegium
     */
    public Duch(int poziciaX, int poziciaY, int sirka, int vyska, String nazov, int privilegium) {
        super(poziciaX, poziciaY, sirka, vyska, nazov, privilegium);
        this.obrazok = new Obrazok("Pictures/ghost.png", super.getPoziciaX(), super.getPoziciaY());
        this.obrazok.zobraz();
        this.uhol = 0;
    }

    /**
     * Zmeni uhol obrazku
     * @param uhol
     */


    public void zmenUhol(int uhol) {
        this.uhol = uhol;
        this.obrazok.zmenUhol(this.uhol);
    }

    /**
     * posunie objekt
     * @param posun
     */

    @Override
    public void posunX(int posun) {
    }

    /**
     * posunie objekt
     * @param posun
     */
    @Override
    public void posunY(int posun) {
    }
}
