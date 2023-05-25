import fri.shapesge.Obdlznik;

public class Stena extends AktivnyPrvokMapy {
    private Obdlznik obdlznik;
    public Stena(int poziciaX, int poziciaY, int sirka, int vyska) {
        super(poziciaX, poziciaY, sirka, vyska, "stena", 3);
        this.obdlznik = new Obdlznik(super.getPoziciaX(), super.getPoziciaY());
        this.obdlznik.zmenStrany(super.getSirka(), super.getVyska());
        this.obdlznik.zmenFarbu("red");
        this.obdlznik.zobraz();
    }
}
