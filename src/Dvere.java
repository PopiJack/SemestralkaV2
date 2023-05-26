import fri.shapesge.Obdlznik;

/**
 * Predstavuje potomka triedy AktivnyPrvok, ked sa dotkne
 * clovek, tak na zaklade nahody sa rozhodne, na ake poschodie pojde
 */
public class Dvere extends AktivnyPrvokMapy {
    private Obdlznik obdlznik;

    /**
     * Inicializacia
     * @param poziciaX
     * @param poziciaY
     * @param sirka
     * @param vyska
     */
    public Dvere(int poziciaX, int poziciaY, int sirka, int vyska) {
        super(poziciaX, poziciaY, sirka, vyska, "dvere", 0);
        this.obdlznik = new Obdlznik(super.getPoziciaX(), super.getPoziciaY());
        this.obdlznik.zmenStrany(super.getSirka(), super.getVyska());
        this.obdlznik.zmenFarbu("brown");
        this.obdlznik.zobraz();
    }

    /**
     * posuniem o posun
     * @param posun
     */

    @Override
    public void posunX(int posun) {
        this.obdlznik.posunVodorovne(posun);
        super.setPoziciaX(super.getPoziciaX() + posun);
    }

    /**
     * posuniem na poziciiY o posun
     * @param posun
     */

    @Override
    public void posunY(int posun) {
        this.obdlznik.posunZvisle(posun);
        super.setPoziciaY(super.getPoziciaY() + posun);
    }
}
