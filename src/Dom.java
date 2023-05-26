import java.util.ArrayList;
import java.util.Random;

/**
 * predstavuje objekt, ktory obsahuje ostatne aktivne prvky mapy
 */
public class Dom {
    private int poziciaX;
    private int poziciaY;
    private ArrayList<AktivnyPrvokMapy> prvky;
    private Dvere dvere0;
    private Izba izba0;
    private Izba izba1;
    private Izba izba2;
    private Izba izba3;
    private Izba izba4;
    private Izba izba5;
    private Izba izba6;
    private Izba izba7;
    private Izba izba8;
    private Izba izba9;
    private Izba izba10;
    private Izba izba11;
    private Izba izba12;
    private Izba izba13;
    private Izba izba14;
    private Izba izba15;
    private Dvere dvere1;
    private Dvere dvere2;
    private Dvere dvere3;
    private Stena stena;
    private Stena stena2;
    private Stena stena3;
    private Stena stena4;
    private Poschodie[] poschodia;
    private Clovek clovek;
    private int pocetLudi;
    private ArrayList<Clovek> ludia;
    private Random nahoda;

    /**
     * Inicializacia objektu
     * @param poziciaX
     * @param poziciaY
     */
    public Dom(int poziciaX, int poziciaY) {
        this.poziciaX = poziciaX;
        this.poziciaY = poziciaY;
        this.prvky = new ArrayList<>();
        this.prvky.add(new Izba(250, this.poziciaY, 100, 100));
        this.stena = new Stena(this.poziciaX + 850, this.poziciaY + 552, 10, 1850);
        this.stena2 = new Stena(this.poziciaX + 3100, this.poziciaY + 552, 10, 1850);
        this.stena3 = new Stena(this.poziciaX + 850,this.poziciaY + 552,2250,10);
        this.stena4 = new Stena(this.poziciaX + 850, this.poziciaY + 1850 + 552, 2250,10);
        this.dvere0 = new Dvere(this.poziciaX + 2125, this.poziciaY + Poschodie.POSCHODIE0.getMinVyska(), 200, 400);
        this.dvere1 = new Dvere(this.poziciaX + 2125, this.poziciaY + Poschodie.POSCHODIE1.getMinVyska(), 200, 400);
        this.dvere2 = new Dvere(this.poziciaX + 2125, this.poziciaY + Poschodie.POSCHODIE2.getMinVyska(), 200, 400);
        this.dvere3 = new Dvere(this.poziciaX + 2125, this.poziciaY + Poschodie.POSCHODIE3.getMinVyska(), 200, 400);
        this.izba0 = new Izba(this.poziciaX + 850, this.poziciaY + 552, 520, 500);
        this.izba1 = new Izba(this.poziciaX + 850, this.poziciaY + 552 + 500, 520, 500);
        this.izba2 = new Izba(this.poziciaX + 850, this.poziciaY + 552 + 500 + 500, 520, 500);
        this.izba3 = new Izba(this.poziciaX + 850, this.poziciaY + 552 + 500 + 500 + 500, 520, 500);
        this.izba4 = new Izba(this.poziciaX + 1400, this.poziciaY + 552 , 520, 500);
        this.izba5 = new Izba(this.poziciaX + 1400, this.poziciaY + 552 + 500 , 520, 500);
        this.izba6 = new Izba(this.poziciaX + 1400, this.poziciaY + 552 + 500 + 500, 520, 500);
        this.izba7 = new Izba(this.poziciaX + 1400, this.poziciaY + 552 + 500 + 500 + 500, 520, 500);
        this.izba8 = new Izba(this.poziciaX + 1900, this.poziciaY + 552 , 520, 500);
        this.izba9 = new Izba(this.poziciaX + 1900, this.poziciaY + 552 + 500 , 520, 500);
        this.izba10 = new Izba(this.poziciaX + 1900, this.poziciaY + 552 + 500 + 500, 520, 500);
        this.izba11 = new Izba(this.poziciaX + 1900, this.poziciaY + 552 + 500 + 500 + 500, 520, 500);
        this.izba12 = new Izba(this.poziciaX + 2500, this.poziciaY + 552 , 520, 500);
        this.izba13 = new Izba(this.poziciaX + 2500, this.poziciaY + 552 + 500 , 520, 500);
        this.izba14 = new Izba(this.poziciaX + 2500, this.poziciaY + 552 + 500 + 500, 520, 500);
        this.izba15 = new Izba(this.poziciaX + 2500, this.poziciaY + 552 + 500 + 500 + 500, 520, 500);
        this.prvky.add(this.izba0);
        this.prvky.add(this.izba1);
        this.prvky.add(this.izba2);
        this.prvky.add(this.izba3);
        this.prvky.add(this.izba4);
        this.prvky.add(this.izba5);
        this.prvky.add(this.izba6);
        this.prvky.add(this.izba7);
        this.prvky.add(this.izba8);
        this.prvky.add(this.izba9);
        this.prvky.add(this.izba10);
        this.prvky.add(this.izba11);
        this.prvky.add(this.izba12);
        this.prvky.add(this.izba13);
        this.prvky.add(this.izba14);
        this.prvky.add(this.izba15);
        this.prvky.add(this.stena);
        this.prvky.add(this.stena2);
        this.prvky.add(this.stena3);
        this.prvky.add(this.stena4);
        this.prvky.add(this.dvere0);
        this.prvky.add(this.dvere1);
        this.prvky.add(this.dvere2);
        this.prvky.add(this.dvere3);
        this.poschodia = new Poschodie[]{Poschodie.POSCHODIE0, Poschodie.POSCHODIE1, Poschodie.POSCHODIE2, Poschodie.POSCHODIE3};
        this.clovek = null;
        this.pocetLudi = 30;
        this.ludia = new ArrayList<>();
        this.nahoda = new Random();
        for (int i = 0; i < this.pocetLudi; i++) {
            this.clovek = new Clovek(this.poziciaX + 1900, this.poziciaY + this.poschodia[this.nahoda.nextInt(this.poschodia.length)].getMinVyska() + 325, this);
            this.ludia.add(this.clovek);
            this.prvky.add(this.clovek);
        }
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


    /**
     * Ludia sa zacnu hybat a reagovat
     *
     */
    public void zapniLudi() {
        for (Clovek clovek1 : this.ludia) {
            clovek1.rozmyslaj();
        }
    }



    /**
     * Posunie vsetko na poziciiX o posun
     * @param posun
     */
    public void posunVsetkoX(int posun) {
        for (AktivnyPrvokMapy aktivnyPrvokMapy : this.prvky) {
            aktivnyPrvokMapy.posunX(posun);
        }
    }

    /**
     * Posunie vsektko na poziciiY o posun
     * @param posun
     */
    public void posunVsetkoY(int posun) {
        for (AktivnyPrvokMapy aktivnyPrvokMapy : this.prvky) {
            aktivnyPrvokMapy.posunY(posun);
        }
    }
}