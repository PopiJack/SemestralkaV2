/**
 * Trieda sluzi na vytvorenie casovych intervalov medzi jednotlivymi ukonmi
 */
public class Casovac {
    private int sekundy;

    /**
     * Inicializacia
     */
    public Casovac() {
        this.sekundy = 0;
    }

    /**
     * Sluzi pre shapes.ge
     */
    public void sekunda() {
        this.sekundy++;
    }

    /**
     * Ziskavame pocet sekund
     * @return sekundy
     */

    public int getSekundy() {
        return this.sekundy;
    }

    /**
     * Nastavujeme kolko je sekund (vacsinou resetujeme, ked nastavime na 0)
     * @param sekundy
     */

    public void setSekundy(int sekundy) {
        this.sekundy = sekundy;
    }

    /**
     * Nastavujeme casovac, po case sa zmeni hodnota koniec na true
     * @param limit nastavime casovy limit v sekundach
     * @return
     */

    public boolean koniec(int limit) {
        if (this.sekundy <= limit) {
            return false;
        }
        return true;
    }
}
