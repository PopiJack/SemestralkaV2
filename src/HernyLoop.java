import java.util.ArrayList;

/**
 * Zabezpecuje ze hra prebieha, dokym ju nevyhrame
 */
public class HernyLoop {
    private ArrayList<Clovek> ludia;

    /**
     * Inicializacia
     */
    public HernyLoop() {
        Dom dom = new Dom(100, 50);
        int pocetLudi = 30;
        boolean koniec = false;
        this.ludia = new ArrayList<>();
        Clovek clovek = null;
        for (int i = 0; i < pocetLudi; i++) {
            clovek = new Clovek(500, 300, dom);
            this.ludia.add(clovek);
        }
        while (!koniec) {
            for (Clovek clovek1 : this.ludia) {
                clovek1.rozmyslaj();
            }
        }

    }
}
