import java.util.ArrayList;

public class Dom {
    private ArrayList<AktivnyPrvokMapy> prvky;
    private Stena stena;
    private Stena stena2;

    public Dom() {
        this.prvky = new ArrayList<>();
        this.prvky.add(new Izba(250, 250, 100, 100));
        this.stena = new Stena(450, 250, 10, 100);
        this.stena2 = new Stena(1000, 250, 10, 100);
        this.prvky.add(this.stena);
        this.prvky.add(this.stena2);
    }

    public int getPocetPrvkov() {
        return this.prvky.size();
    }

    public AktivnyPrvokMapy getPrvok(int index) {
        return this.prvky.get(index);
    }
}