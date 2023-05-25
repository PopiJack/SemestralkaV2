import fri.shapesge.Obdlznik;

/**
 * Predstavuje aktivny prvok mapy, ktory clovek namoze prejst
 */
public class Stena extends AktivnyPrvokMapy {
    private Obdlznik obdlznik;

    /**
     * Inicializacia triedy
     * @param poziciaX
     * @param poziciaY
     * @param sirka
     * @param vyska
     */
    public Stena(int poziciaX, int poziciaY, int sirka, int vyska) {
        super(poziciaX, poziciaY, sirka, vyska, "stena", 3);
        this.obdlznik = new Obdlznik(super.getPoziciaX(), super.getPoziciaY());
        this.obdlznik.zmenStrany(super.getSirka(), super.getVyska());
        this.obdlznik.zmenFarbu("red");
        this.obdlznik.zobraz();
    }
}
