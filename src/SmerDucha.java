/**
 * Trieda, ktora nam urcuje jednotlive smery, ktore duch moze mat
 * a na zaklade toho, nam vrati uhol
 */
public enum SmerDucha {
    HORE(0),
    DOLE(180),
    VPRAVO(90),
    VLAVO(270);

    private final int uhol;

    SmerDucha(int aktualnyUhol) {
        this.uhol = aktualnyUhol;
    }

    /**
     * vrati uhol
     * @return
     */
    public int getUhol() {
        return this.uhol;
    }
}
