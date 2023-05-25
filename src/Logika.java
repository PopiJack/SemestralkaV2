import fri.shapesge.Manazer;
import fri.shapesge.Text;

import java.util.Random;

/**
 * Trieda predstavuje hlavnu logiku hry
 */
public class Logika {
    private Clovek clovek;
    private Dom dom;
    private ManazerKolizie manazerK;
    private Manazer manazer;
    private Casovac casovac;
    private Smer[] smery;
    private Random nahoda;
    private Random nahoda1;
    private Random nahoda2;
    private int rychlost;

    /**
     * Inicializacia
     * @param clovek
     * @param dom
     */
    public Logika(Clovek clovek, Dom dom) {
        this.clovek = clovek;
        this.dom = dom;
        this.manazerK = new ManazerKolizie();
        this.manazer = new Manazer();
        this.casovac = new Casovac();
        this.smery = new Smer[2];
        this.smery[0] = Smer.DOLAVA;
        this.smery[1] = Smer.DOPRAVA;
        this.nahoda = new Random();
        this.nahoda1 = new Random();
        this.nahoda2 = new Random();
        this.rychlost = 3;
        this.rozmyslaj();
    }

    /**
     * Metoda ovlada kazdeho cloveka na zaklade relativnej pozicie cloveka a domu
     */

    public void rozmyslaj() {
        var koniec = false;
        var pozicia = this.nahoda.nextInt(2);
        var smer = this.smery[pozicia];
        var vzdialenost = this.nahoda1.nextInt(10);
        for (int i = 0; i < vzdialenost; i++) {
            this.manazer.spravujObjekt(this.casovac);
            while (!this.casovac.koniec(1)) {
                System.out.println(this.dom.getPrvok(0).getPoziciaX() + "+" + this.dom.getPrvok(0).getSirka()  + ">="  + this.clovek.getPoziciaX());
                System.out.println(this.dom.getPrvok(0).getPoziciaX() + "<=" + this.clovek.getPoziciaX() + "+" + this.clovek.getSirka());
                System.out.println(this.dom.getPrvok(0).getPoziciaY() + "+" + this.dom.getPrvok(0).getVyska() + ">=" + this.clovek.getPoziciaY());
                System.out.println(this.dom.getPrvok(0).getPoziciaY() + "<=" + this.clovek.getPoziciaY() + "+" + this.clovek.getVyska());
                System.out.println("---------------------------------------------------------------");
            }
            for (int j = 0; j < this.dom.getPocetPrvkov(); j++) {
                if (this.manazerK.kolizia(this.clovek, this.dom.getPrvok(j))) {
                    if (this.dom.getPrvok(j)instanceof Stena) {
                        if (this.dom.getPrvok(j).getPoziciaX() <= this.clovek.getPoziciaX()) {
                            smer = Smer.DOPRAVA;
                        } else {
                            smer = Smer.DOLAVA;
                        }
                    } else if (this.dom.getPrvok(j) instanceof Dvere) {
                        var poschodie = this.dom.getPoschodie(this.nahoda2.nextInt(this.dom.getPocetPoschodi() ));
                        var posun = poschodie.getMinVyska() - this.clovek.getPoziciaY();
                        this.clovek.posunY(posun);
                        this.clovek.posunX(10);
                    }
                    var text = new Text(this.dom.getPrvok(j).getNazov(), 10, 100);
                    text.zobraz();
                    break;
                }
            }


            this.clovek.posunX(smer.getKoeficient() * this.rychlost);
            this.manazer.prestanSpravovatObjekt(this.casovac);
            this.casovac.setSekundy(0);
        }


    }
}
