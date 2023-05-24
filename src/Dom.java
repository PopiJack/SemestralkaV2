import java.util.ArrayList;

public class Dom {
    private ArrayList<Izba> izby;

    public Dom() {
        this.izby = new ArrayList<>();
        this.izby.add(new Izba(250, 250, 100, 100));
    }

    public int getPocetIzieb() {
        return this.izby.size();
    }

    public Izba getKonkretnuIzbu(int index) {
        return this.izby.get(index);
    }
}
