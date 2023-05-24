import fri.shapesge.Obdlznik;

public class Clovek extends AktivnyPrvokMapy {
    private Obdlznik obdlznik;
    private Dom dom;
    private Logika logika;

    public Clovek(int poziciaX, int poziciaY, Dom dom) {
        super(poziciaX, poziciaY, 20, 50, "clovek", 1);
        this.dom = dom;
        this.obdlznik = new Obdlznik(super.getPoziciaX(), super.getPoziciaX());
        this.obdlznik.zmenStrany(super.getSirka(), super.getVyska());
        this.obdlznik.zobraz();
        this.logika = new Logika(this, this.dom);
    }

    public void posunX(int posun) {
        this.obdlznik.posunVodorovne(posun);
        super.setPoziciaX(super.getPoziciaX() + posun);
    }


}
