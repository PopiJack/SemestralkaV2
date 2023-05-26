import fri.shapesge.Kruh;
import fri.shapesge.Obdlznik;
import fri.shapesge.Obrazok;

/**
 * Predstavuje objekt clovek
 */
public class Clovek extends AktivnyPrvokMapy {
    private Obdlznik obdlznik;
    private Dom dom;
    private Kruh hlava;
    private Logika logika;
    private Obrazok face;

    /**
     * Inicializacia jednotlivych objektov, z ktorych sa postava sklada
     * @param poziciaX
     * @param poziciaY
     * @param dom
     */
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
        this.face = new Obrazok("Pictures/Faces/happy.png", poziciaX, poziciaY);
        this.face.zobraz();
        this.logika = new Logika(this, this.dom);
    }

    /**
     * posuvame cloveka o danu hodnotu, hlavne pri pohybe
     * @param posun
     */

    public void posunX(int posun) {
        this.hlava.posunVodorovne(posun);
        this.obdlznik.posunVodorovne(posun);
        this.face.posunVodorovne(posun);
        super.setPoziciaX(super.getPoziciaX() + posun);
    }

    /**
     * Posuvame cloveka o danu hodnotu, hlavne pri vyuzivani dveri
     * @param posun
     */

    public void posunY(int posun) {
        this.obdlznik.skry();
        this.face.skry();
        this.hlava.skry();
        this.face.posunZvisle(posun);
        this.obdlznik.posunZvisle(posun);
        this.hlava.posunZvisle(posun);
        super.setPoziciaY(super.getPoziciaY() + posun);
        this.obdlznik.zobraz();
        this.hlava.zobraz();
        this.face.zobraz();
    }

    /**
     * pre kazdeho cloveka zapne logiku
     */

    public void rozmyslaj() {
        this.logika.rozmyslaj();
    }

    /**
     * Zmeni obrazok
     */

    public void zmenObrazok(String novaCesta) {
        this.face.zmenObrazok(novaCesta);
    }

}
