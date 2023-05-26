public class Main {
    /**
     * Hlavna trieda, ktora je na spustenie programu
     * @param args
     */
    public static void main(String[] args) {
        Mapa mapa = new Mapa();
        Duch duch = new Duch(720,360,180,180,"duch", 3);
        HernyLoop hra = new HernyLoop(duch, mapa);
    }
}