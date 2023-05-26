import fri.shapesge.Manazer;

import java.util.ArrayList;

/**
 * Zabezpecuje ze hra prebieha, dokym ju nevyhrame
 */
public class HernyLoop {
    private boolean funguje;
    private Duch duch;
    private Mapa mapa;
    private Ovladanie ovladanie;
    private Manazer manazer;

    /**
     * Inicializacia
     */
    public HernyLoop(Duch duch, Mapa mapa) {
        this.duch = duch;
        this.mapa = mapa;
        this.funguje = true;
        boolean koniec = true;
        this.manazer = new Manazer();
        this.ovladanie = new Ovladanie(this.mapa, this.duch);
        this.manazer.spravujObjekt(this.ovladanie);


        while (this.funguje) {
            mapa.zapniLudi();
        }

    }
}
