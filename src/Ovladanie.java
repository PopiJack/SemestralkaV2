/**
 * trieda riadi ovladanie hry
 */
public class Ovladanie {
    private Mapa mapa;
    private Duch duch;
    private int rychlostOvladania;
    private SmerDucha smer;
    private boolean posuvanieDoprava;
    private boolean posuvanieDolava;
    private boolean posuvanieDole;
    private boolean posuvanieHore;
    private ManazerKolizie manazerK;

    /**
     * Inicializacia
     */
    public Ovladanie(Mapa mapa, Duch duch) {
        this.mapa = mapa;
        this.duch = duch;
        this.rychlostOvladania = 15;
        this.smer = SmerDucha.HORE;
        this.posuvanieDoprava = true;
        this.posuvanieDolava = true;
        this.posuvanieDole = true;
        this.posuvanieHore = true;
        this.manazerK = new ManazerKolizie();
    }

    /**
     * Posunie ducha a vybrane predmety v smere, no ak dosiahne stenu
     * dalej nas uz nepusti
     */

    public void hore () {
        this.posuvanieDole = true;
        if (this.posuvanieHore) {
            this.mapa.posunMapuY(this.rychlostOvladania);
            this.smer = SmerDucha.HORE;
            this.zmenUholDucha();
            for(int i = 0; i < this.mapa.getDom().getPocetPrvkov(); i++) {
                if(this.manazerK.kolizia(this.duch,this.mapa.getDom().getPrvok(i))){
                    if(this.mapa.getDom().getPrvok(i) instanceof Stena) {
                        this.vypniPosuvanieHore();
                    }
                }

            }
        }
    }


    /**
     * Posunie ducha a vybrane predmety v smere, no ak dosiahne stenu
     * dalej nas uz nepusti
     */
    public void dole () {
        this.posuvanieHore = true;
        if (this.posuvanieDole) {
            this.mapa.posunMapuY(-this.rychlostOvladania);
            this.smer = SmerDucha.DOLE;
            this.zmenUholDucha();
            for(int i = 0; i < this.mapa.getDom().getPocetPrvkov(); i++) {
                if(this.manazerK.kolizia(this.duch,this.mapa.getDom().getPrvok(i))){
                    if(this.mapa.getDom().getPrvok(i) instanceof Stena) {
                        this.vypniPosuvanieDole();
                    }
                }
            }
        }
    }

    /**
     * Posunie ducha a vybrane predmety v smere, no ak dosiahne stenu
     * dalej nas uz nepusti
     */

    public void doprava () {
        this.posuvanieDolava = true;
        if (this.posuvanieDoprava) {
            this.mapa.posunMapuX(-this.rychlostOvladania);
            this.smer = SmerDucha.VPRAVO;
            this.zmenUholDucha();
            for(int i = 0; i < this.mapa.getDom().getPocetPrvkov(); i++) {
                if(this.manazerK.kolizia(this.duch,this.mapa.getDom().getPrvok(i))){
                    if(this.mapa.getDom().getPrvok(i) instanceof Stena) {
                        this.vypniposuvanieDoprava();
                    }
                }
            }
        }
    }

    /**
     * Posunie ducha a vybrane predmety v smere, no ak dosiahne stenu
     * dalej nas uz nepusti
     */

    public void dolava() {
        this.posuvanieDoprava = true;
        if (this.posuvanieDolava) {
            this.mapa.posunMapuX(this.rychlostOvladania);
            this.smer = SmerDucha.VLAVO;
            this.zmenUholDucha();
            for(int i = 0; i < this.mapa.getDom().getPocetPrvkov(); i++) {
                if(this.manazerK.kolizia(this.duch,this.mapa.getDom().getPrvok(i))){
                    if(this.mapa.getDom().getPrvok(i) instanceof Stena) {
                        this.vypniPosuvanieDolava();
                    }
                }
            }
        }
    }

    /**
     * sluzi na vypinanie svetla
     */

    public void medzernik() {
        for(int i = 0; i < this.mapa.getDom().getPocetPrvkov(); i++) {
            if(this.manazerK.kolizia(this.duch,this.mapa.getDom().getPrvok(i))){
                if(this.mapa.getDom().getPrvok(i) instanceof Izba) {
                    ((Izba) this.mapa.getDom().getPrvok(i)).vypniSvetlo();
                }
            }
        }
    }






    /**
     * Vypne posuvanie do daneho smeru
     */

    public void vypniPosuvanieDolava() {
        this.posuvanieDolava = false;
    }

    /**
     * Vypne posuvanie do daneho smeru
     */
    public void vypniposuvanieDoprava() {
        this.posuvanieDoprava = false;
    }

    /**
     * Vypne posuvanie do daneho smeru
     */
    public void vypniPosuvanieHore() {
        this.posuvanieHore = false;
    }

    /**
     * Vypne posuvanie do daneho smeru
     */
    public void vypniPosuvanieDole() {
        this.posuvanieDole = false;
    }

    /**
     * Vypne posuvanie do daneho smeru
     */
    private void zmenUholDucha(){
        this.duch.zmenUhol(this.smer.getUhol());
    }


}
