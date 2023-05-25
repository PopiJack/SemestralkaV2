/**
 * trieda zabezpecuje, ze postava ide doprava alebo dolava pomocou
 * nasobenia bud 1/-1
 */
public enum Smer {
    DOPRAVA(1),
    DOLAVA(-1);

    private int koeficient;

    /**
     * Inicializacia
     * @param koeficient
     */
    Smer(int koeficient) {
        this.koeficient = koeficient;
    }

    /**
     * Ziskavame koeficient
     * @return koeficient
     */

    public int getKoeficient() {
        return this.koeficient;
    }
}
