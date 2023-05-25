import fri.shapesge.Kruh;
import fri.shapesge.Obdlznik;
import fri.shapesge.Obrazok;

public class Clovek extends AktivnyPrvokMapy {
    private Obdlznik obdlznik;
    private Dom dom;
    private Kruh hlava;
    private Logika logika;
    private Obrazok face;

    public Clovek(int poziciaX, int poziciaY, Dom dom) {
        super(poziciaX, poziciaY, 20, 50, "clovek", 1);
        this.dom = dom;
        this.hlava = new Kruh(super.getPoziciaX(), super.getPoziciaY());
        this.hlava.zmenPriemer(super.getSirka());
        this.hlava.zmenFarbu("telova");
        this.hlava.zobraz();
        this.obdlznik = new Obdlznik(super.getPoziciaX() , super.getPoziciaY() + super.getSirka());
        this.obdlznik.zmenStrany(super.getSirka(), super.getVyska());
        this.obdlznik.zobraz();
        this.face = new Obrazok("src/sad.png", poziciaX, poziciaY);
        this.face.zobraz();
        this.logika = new Logika(this, this.dom);
    }

    public void posunX(int posun) {
        this.hlava.posunVodorovne(posun);
        this.obdlznik.posunVodorovne(posun);
        this.face.posunVodorovne(posun);
        super.setPoziciaX(super.getPoziciaX() + posun);
    }

    public void rozmyslaj() {
        this.logika.rozmyslaj();
    }

}
