import java.util.ArrayList;

/**
 * predstavuje objekt, ktory obsahuje ostatne aktivne prvky mapy
 */
public class Dom {
    private int poziciaX;
    private int poziciaY;
    private ArrayList<AktivnyPrvokMapy> prvky;
    private Dvere dvere0;
    private Dvere dvere1;
    private Dvere dvere2;
    private Dvere dvere3;
    private Stena stena;
    private Stena stena2;
    private Poschodie[] poschodia;

    /**
     * Inicializacia objektu
     * @param poziciaX
     * @param poziciaY
     */
    public Dom(int poziciaX, int poziciaY) {
        this.poziciaX = poziciaX;
        this.poziciaY = poziciaY;
        this.prvky = new ArrayList<>();
        this.prvky.add(new Izba(250, 250, 100, 100));
        this.stena = new Stena(450, 250, 10, 100);
        this.stena2 = new Stena(1000, 250, 10, 100);
        this.dvere0 = new Dvere(600, Poschodie.POSCHODIE0.getMinVyska(), 50, 50);
        this.dvere1 = new Dvere(600, Poschodie.POSCHODIE1.getMinVyska(), 50, 50);
        this.dvere2 = new Dvere(600, Poschodie.POSCHODIE2.getMinVyska(), 50, 50);
        this.dvere3 = new Dvere(600, Poschodie.POSCHODIE3.getMinVyska(), 50, 50);
        this.prvky.add(this.stena);
        this.prvky.add(this.stena2);
        this.prvky.add(this.dvere0);
        this.prvky.add(this.dvere1);
        this.prvky.add(this.dvere2);
        this.prvky.add(this.dvere3);
        this.poschodia = new Poschodie[]{Poschodie.POSCHODIE0, Poschodie.POSCHODIE1, Poschodie.POSCHODIE2, Poschodie.POSCHODIE3};
    }

    /**
     * ziskavame pocet aktivnych prvkov v objekte
     * @return velkost kontajnera s aktivnymi prvkami
     */
    public int getPocetPrvkov() {
        return this.prvky.size();
    }

    /**
     * Ziskavame konkretny prvok
     * @param index
     * @return AktivnyPrvokMapy
     */

    public AktivnyPrvokMapy getPrvok(int index) {
        return this.prvky.get(index);
    }

    /**
     * Ziskavame pocet poschodi
     * @return pocet poschodi
     */
    public int getPocetPoschodi() {
        return this.poschodia.length;
    }

    /**
     * ziskavame konkretne poschodie
     * @param index
     * @return
     */
    public Poschodie getPoschodie(int index) {
        return this.poschodia[index];
    }
}