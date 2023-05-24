public abstract class AktivnyPrvokMapy {
    private int poziciaX;
    private int poziciaY;
    private int sirka;
    private int vyska;
    private String nazov;

    private int privilegium;

    public AktivnyPrvokMapy(int poziciaX, int poziciaY, int sirka, int vyska, String nazov, int privilegium) {
        this.poziciaX = poziciaX;
        this.poziciaY = poziciaY;
        this.sirka = sirka;
        this.vyska = vyska;
        this.nazov = nazov;
        this.privilegium = privilegium;
    }

    public int getPoziciaX() {
        return this.poziciaX;
    }

    public void setPoziciaX(int poziciaX) {
        this.poziciaX = poziciaX;
    }

    public int getPoziciaY() {
        return this.poziciaY;
    }

    public void setPoziciaY(int poziciaY) {
        this.poziciaY = poziciaY;
    }

    public int getSirka() {
        return this.sirka;
    }

    public void setSirka(int sirka) {
        this.sirka = sirka;
    }

    public int getVyska() {
        return this.vyska;
    }

    public void setVyska(int vyska) {
        this.vyska = vyska;
    }

    public String getNazov() {
        return this.nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public int getPrivilegium() {
        return this.privilegium;
    }

    public void setPrivilegium(int privilegium) {
        this.privilegium = privilegium;
    }
}
