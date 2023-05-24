public class Casovac {
    private int sekundy;

    public Casovac() {
        this.sekundy = 0;
    }

    public void sekunda() {
        this.sekundy++;
    }

    public int getSekundy() {
        return this.sekundy;
    }

    public void setSekundy(int sekundy) {
        this.sekundy = sekundy;
    }

    public boolean koniec(int limit) {
        if (this.sekundy <= limit) {
            return false;
        }
        return true;
    }
}
