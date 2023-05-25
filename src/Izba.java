import fri.shapesge.Obdlznik;

import java.util.ArrayList;

/**
 * Trieda predstavuje potomok abstraktnej triedz AktivnyPrvokMapy
 * Sluzi na to, aby sme vedeli ci v danej  izbe strasi alebo nie
 */
public class Izba extends AktivnyPrvokMapy {
    private Obdlznik obdlznik;
    private boolean jeTma;

    private ArrayList<AktivnyPrvokMapy> predmety;

    /**
     * Inicializacia
     * @param poziciaX
     * @param poziciaY
     * @param sirka
     * @param vyska
     */
    public Izba(int poziciaX, int poziciaY, int sirka, int vyska) {
        super(poziciaX, poziciaY, sirka, vyska, "izba", 0);
        this.jeTma = false;
        this.obdlznik = new Obdlznik(super.getPoziciaX(), super.getPoziciaY());
        this.obdlznik.zmenStrany(super.getSirka(), super.getVyska());
        this.obdlznik.zmenFarbu("black");
        this.obdlznik.zobraz();
        this.predmety = new ArrayList<>();
    }

    /**
     * Meni premennu z tmy na svetlo a naopak
     */

    public void vypniSvetlo() {
        this.jeTma = true;
        this.obdlznik.zobraz();
    }

    /**
     * Sluzi na zmenu premennej z tmy na svetlo
     */

    public void zapniSvetlo() {
        this.jeTma = false;
        this.obdlznik.skry();
    }

    /**
     * Vrati nam pocetPrvok ktore sa v izbe nachadzaju
     * (pouzivane v buducnosti)
     * @return
     */

    public int getPocetPrvkov() {
        return this.predmety.size();
    }

    /**
     * vrati nam konkretny prvok z izby
     * @param index
     * @return
     */

    public AktivnyPrvokMapy getKonkretnyPrvokIzby(int index) {
        return this.predmety.get(index);
    }
}
