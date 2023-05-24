import fri.shapesge.Manazer;

import java.util.Random;

public class Logika {
    private Clovek clovek;
    private Dom dom;
    private ManazerKolizie manazerK;
    private Manazer manazer;
    private Casovac casovac;
    private Smer[] smery;
    private Random nahoda;
    private Random nahoda1;

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
        this.rozmyslaj();
    }

    public void rozmyslaj() {
        var nekonecno = true;
        while (nekonecno) {

            var pozicia = this.nahoda.nextInt(2);
            var smer = this.smery[pozicia];
            var vzdialenost = this.nahoda1.nextInt(10);

            for (int i = 0; i < vzdialenost; i++) {
                this.manazer.spravujObjekt(this.casovac);
                while (!this.casovac.koniec(1)) {
                    System.out.println(this.clovek.getPoziciaX() + "," + this.clovek.getPoziciaY());
                    System.out.println(this.dom.getKonkretnuIzbu(0).getPoziciaX() + "," + this.dom.getKonkretnuIzbu(0).getPoziciaY());
                }
                this.clovek.posunX(smer.getKoeficient() * 5);
                this.manazer.prestanSpravovatObjekt(this.casovac);
                this.casovac.setSekundy(0);
                for (int j = 0; j < this.dom.getPocetIzieb(); j++) {
                    if (this.manazerK.kolizia(this.dom.getKonkretnuIzbu(j), this.clovek)) {
                        System.out.println(this.dom.getKonkretnuIzbu(j).getNazov());
                        break;
                    }
                }
            }
        }


    }
}
