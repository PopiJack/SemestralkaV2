public class HernyLoop {
    public HernyLoop() {
        Dom dom = new Dom();
        boolean koniec = false;
        Clovek clovek = new Clovek(500, 300, dom);
        Clovek clovek1 = new Clovek(100, 300, dom);
        while (!koniec) {
            clovek.rozmyslaj();
            clovek1.rozmyslaj();
        }

    }
}
