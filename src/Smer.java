public enum Smer {
    DOPRAVA(1),
    DOLAVA(-1);

    private int koeficient;
    Smer(int koeficient) {
        this.koeficient = koeficient;
    }

    public int getKoeficient() {
        return this.koeficient;
    }
}
