import fri.shapesge.Obdlznik;

import java.util.ArrayList;

public class Izba extends AktivnyPrvokMapy {
    private Obdlznik obdlznik;

    private ArrayList<AktivnyPrvokMapy> predmety;

    public Izba(int poziciaX, int poziciaY, int sirka, int vyska) {
        super(poziciaX, poziciaY, sirka, vyska, "izba", 0);
        this.obdlznik = new Obdlznik(super.getPoziciaX(), super.getPoziciaY());
        this.obdlznik.zmenStrany(super.getSirka(), super.getVyska());
        this.obdlznik.zmenFarbu("blue");
        this.obdlznik.zobraz();
        this.predmety = new ArrayList<>();
    }

    public int getPocetPrvkov() {
        return this.predmety.size();
    }

    public AktivnyPrvokMapy getKonkretnyPrvokIzby(int index) {
        return this.predmety.get(index);
    }
}
