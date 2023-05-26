import fri.shapesge.Manazer;
import fri.shapesge.Obdlznik;

import java.util.ArrayList;

/**
 * Trieda predstavuje potomok abstraktnej triedz AktivnyPrvokMapy
 * Sluzi na to, aby sme vedeli ci v danej  izbe strasi alebo nie
 */
public class Izba extends AktivnyPrvokMapy {
    private Obdlznik obdlznik;
    private boolean jeTma;
    private Casovac casovac;
    private Manazer manazer;

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
        this.predmety = new ArrayList<>();
        this.casovac = new Casovac();
        this.manazer = new Manazer();
    }

    /**
     * Meni premennu z tmy na svetlo a naopak
     */

    public void vypniSvetlo() {
        this.jeTma = true;
        this.obdlznik.zobraz();
        this.manazer.spravujObjekt(this.casovac);
        while(!this.casovac.koniec(2)){
            System.out.println("");
        }
        this.casovac.setSekundy(0);
        this.zapniSvetlo();
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

    /**
     * vrati, ci je v izbe tma, alebo svetlo
     * @return
     */
    public boolean getSvetlo() {
        return this.jeTma;
    }

    /**
     * posunie po osi X
     * @param posun
     */
    @Override
    public void posunX(int posun) {
        this.obdlznik.posunVodorovne(posun);
        super.setPoziciaX(super.getPoziciaX() + posun);
    }

    /**
     * posuni po osi Y
     * @param posun
     */

    @Override
    public void posunY(int posun) {
        this.obdlznik.posunZvisle(posun);
        super.setPoziciaY(super.getPoziciaY() + posun);
    }
}
